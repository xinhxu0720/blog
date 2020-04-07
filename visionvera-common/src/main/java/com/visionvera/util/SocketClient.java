package com.visionvera.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import com.alibaba.fastjson.JSONObject;

public class SocketClient {
	private Socket socket;
	private String host;
	private int port;
	private int headLen = 22;
	private byte[] bHead = new byte[headLen];
	private byte[] recvByts = new byte[0];
	private int dataLen = 0;

	public SocketClient() {
	}

	public SocketClient(String host, int port) {
		this.host = host;
		this.port = port;
		bHead[0] = 2;
		bHead[1] = 0;
		bHead[2] = 2;
		bHead[3] = 2;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int start() throws IOException {
		try
		{
			this.socket = new Socket();
			SocketAddress socketAddress = new InetSocketAddress(host, port);
			this.socket.connect(socketAddress, 6000);
			this.socket = new Socket(host, port);
			this.socket.setSoTimeout(20000);
			this.sendData(VSMeet.VSM_WEBSERVICE, null);
		}catch(Exception e)
		{
			return -1;
		}
		return 0;
	}

	public int close() throws IOException {
		try
		{
			this.socket.close();
		}catch(Exception e)
		{
			return -1;
		}
		return 0;
	}

	public void sendData(byte[] data) throws IOException {
		byte[] b = new byte[data.length + 8];
		byte[] head = new byte[8];
		int2byte(data.length, head);
		System.arraycopy(head, 0, b, 0, 4);
		System.arraycopy(head, 0, b, 4, 4);
		System.arraycopy(data, 0, b, 8, data.length);
		OutputStream os = this.socket.getOutputStream();
		os.write(b);
		os.flush();
		b = null;
		head = null;
	}
	
	public void sendData(int cmd, byte[] data, int type) throws IOException {
		OutputStream oStream = this.socket.getOutputStream();
		
		this.setCmd((short)cmd);
		this.setPackageNo(IDWorker.getInstance().nextId());
		boolean isChaiBao = false;
		if(!isChaiBao)
		{
			byte[] b = new byte[data.length + headLen];
			this.setPackageNum((short)1);
			this.setPackageIndex((short)1);
			this.setDataLen(data.length + headLen);
			System.arraycopy(bHead, 0, b, 0, headLen);
			System.arraycopy(data, 0, b, headLen, data.length);
			//直接发送数据不进行拆包操作
			oStream.write(b);
			oStream.flush();
			b = null;
		}
		else{
			int size = data.length;
			int packSize = 1024 * 64 - this.headLen;
			byte[] b;
			////利用取余运算，计算拆包数量
			int total = 0;
			if(64 > data.length)
				total = data.length % packSize == 0 ? data.length/ packSize : data.length/ packSize + 1;
			else
				total = 1;
			int index = 1;
			int currentSize = 0;
			int dealLen = 0;
			this.setPackageNum((short)total);
			while(0 < total && index <= total)
			{
				if (currentSize >= packSize)
					currentSize = packSize;
				else
					currentSize = size;
				this.setDataLen(this.headLen + currentSize);
				this.setPackageIndex((short)index);
				b = new byte[this.headLen + currentSize];
				System.arraycopy(bHead, 0, b, 0, headLen);
				System.arraycopy(data, dealLen, b, headLen, currentSize);
				index++;
				dealLen += currentSize;
				size -= currentSize;
				oStream.write(b);
				oStream.flush();
			}
			b = null;
		}
	}
	
	
	public void sendData(int cmd, byte[] data) throws IOException{
		OutputStream oStream = this.socket.getOutputStream();
		this.setCmd((short)cmd);
		this.setPackageNo(IDWorker.getInstance().nextId());
		if(cmd == VSMeet.VSM_WEBSERVICE && data == null)
		{
			byte[] b = new byte[this.headLen];
			this.setPackageNum((short)1);
			this.setPackageIndex((short)1);
			this.setDataLen(headLen);
			System.arraycopy(bHead, 0, b, 0, headLen);
			//直接发送数据不进行拆包操作
			oStream.write(b);
			oStream.flush();
			b = null;
		}
		else{
			int size = data.length;
			int packSize = 1024 * 64 - this.headLen;
			int currentSize = 0;
			byte[] b;
			////利用取余运算，计算拆包数量
			int total = 0;
			if(packSize > data.length)
				total = data.length % packSize == 0 ? data.length/packSize : data.length/packSize + 1;
			else
				total = 1;
			int index = 1;
			this.setPackageNum((short)total);
			
			int dealLen = 0;
			while(0 < total && index <= total)
			{
				if (currentSize >= packSize)
					currentSize = packSize;
				else
					currentSize = size;
				this.setDataLen(this.headLen + currentSize);
				this.setPackageIndex((short)index);
				b = new byte[this.headLen + currentSize];
				System.arraycopy(bHead, 0, b, 0, headLen);
				System.arraycopy(data, dealLen, b, headLen, currentSize);
				index++;
				dealLen += currentSize;
				size -= currentSize;
				oStream.write(b);
				oStream.flush();
			}
			b = null;
		}
		
	};
	
	public void snedData(String data) throws IOException {
		/*byte[] b = new byte[data.length + 8];
		byte[] head = new byte[8];
		int2byte(data.length, head);
		System.arraycopy(head, 0, b, 0, head.length);
		System.arraycopy(data, 0, b, 8, data.length);
		OutputStream os = this.socket.getOutputStream();
		os.write(b);
		os.flush();
		b = null;
		head = null;*/
	}
	
	/**
	 * 同步调用返回json结果数据
	 * @param valueType
	 * @return
	 * @throws IOException
	 */
	public <T>JSONObject recvData( Class<T> valueType) throws IOException {
		//InputStream inputStream = this.socket.getInputStream();
		//long startTime = System.currentTimeMillis();
		try
		{
		BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
		int total = this.loopRecv(in);
		total--;
		while(total > 0)
		{
			this.loopRecv(in);
			total--;
		}
		String rsp = new String(this.recvByts, 0, this.dataLen, "UTF-8");
		JSONObject obj = JSONObject.parseObject(rsp);
		return obj;
		}catch(Exception e){
			return null;
		}
	}

	/**
	 * 循环接受拆包后的数据
	 * @param in
	 * @return
	 * @throws IOException
	 */
	private int loopRecv(BufferedInputStream in) throws IOException{
		byte[] head = new byte[headLen];
		int len = 0;
		int reLen = 0;
		// 读取数据头
		while (reLen < head.length) {
			len = in.read(head, reLen, head.length - reLen);
			if (len == -1)
				return -1;
			else {
				reLen += len;
				continue;
			}
		}
		int packageSize = this.getDataLen(head); // 获取有效数据长度
		this.recvByts = new byte[this.getPackageNum(head) * packageSize - this.headLen];
		if (packageSize == 0)
			return -1;
		len = 0;
		reLen = 0;
		while (reLen < packageSize - this.headLen) {
			len = in.read(this.recvByts, reLen, this.recvByts.length - reLen);
			if (len == -1)
				return -1;
			else {
				reLen += len;
				this.dataLen += len;
				continue;
			}
		}
		return this.getPackageNum(head);
	}
	
	
	/**
	 * 读取报文头命令码
	 * @param byt
	 * @return
	 */
	@SuppressWarnings("unused")
	private short getCmd(byte[] byt){
		return (short) (((byt[5] << 8) | byt[4] & 0xff));
	}
	
	/**
	 * 设置报文头命令码
	 * @param cmd
	 */
	private void setCmd(short cmd){
		this.bHead[5] = (byte) (cmd >> 8);  
		this.bHead[4] = (byte) (cmd >> 0); 
	}
	
	/**
	 * 设置报文头当前包数据体总长度
	 * @param len
	 */
	private void setDataLen(int len){
		this.bHead[6] = (byte) (len & 0xff);// 最低位
		this.bHead[7] = (byte) ((len >> 8) & 0xff);// 次低位
		this.bHead[8] = (byte) ((len >> 16) & 0xff);// 次高位
		this.bHead[9] = (byte) (len >> 24);// 最高位,无符号右移。
	}
	
	/**
	 * 读取报文头当前包数据体总长度
	 * @param byt
	 * @return
	 */
	private int getDataLen(byte[] byt){
		int targets = (byt[6] & 0xff) | ((byt[7] << 8) & 0xff00) // | 表示安位或
				| ((byt[8] << 24) >>> 8) | (byt[9] << 24);
		return targets;
	}
	
	
	
	/**
	 * 读取报文头消息号
	 * @param byt
	 * @return
	 */
	@SuppressWarnings("unused")
	private long getPackageNo(byte[] byt){
		long s =0; 
        long s0 = byt[10]&0xff;// 最低位 
        long s1 = byt[11]&0xff; 
        long s2 = byt[12]&0xff; 
        long s3 = byt[13]&0xff; 
        long s4 = byt[14]&0xff;// 最低位 
        long s5 = byt[15]&0xff; 
        long s6 = byt[16]&0xff; 
        long s7 = byt[17]&0xff; 
 
        // s0不变 
        s1 <<=8; 
        s2 <<=16; 
        s3 <<=24; 
        s4 <<=8*4; 
        s5 <<=8*5; 
        s6 <<=8*6; 
        s7 <<=8*7; 
        s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7; 
        return s; 
	}
	
	/**
	 * 设置报文头消息号
	 * @param no
	 */
	private void setPackageNo(long no){
		long temp = no; 
        for(int i =10; i < this.bHead.length; i++){
        	if(i > 17)
        		break;
        	this.bHead[i]=new Long(temp & 0xff).byteValue();// 将最低位保存在最低位 
            temp = temp >>8;// 向右移8位 
        } 
	}
	
	/**
	 * 读取报文头拆包数量
	 * @param byt
	 * @return
	 */
	private short getPackageNum(byte[] byt){
		return (short) (((byt[19] << 8) | byt[18] & 0xff));
	}
	
	/**
	 * 设置报文头拆包数量
	 * @param count
	 */
	private void setPackageNum(short count){
		this.bHead[19] = (byte) (count >> 8);  
		this.bHead[18] = (byte) (count >> 0); 
	}
	
	/**
	 * 读取报文头包序号
	 * @param byt
	 * @return
	 */
	@SuppressWarnings("unused")
	private short getPackageIndex(byte[] byt){
		return (short) (((byt[21] << 8) | byt[20] & 0xff));
	}
	
	/**
	 * 设置报文头包序号
	 * @param index
	 */
	private void setPackageIndex(short index){
		this.bHead[21] = (byte) (index >> 8);  
		this.bHead[20] = (byte) (index >> 0); 
	}
	
	/**
	 * 字节数组转整形
	 * @param byt
	 * @return
	 */
	@SuppressWarnings("unused")
	private int byte2int(byte[] byt) {
		if (byt.length == 0)
			return 0;
		int targets = (byt[0] & 0xff) | ((byt[1] << 8) & 0xff00) // | 表示安位或
				| ((byt[2] << 24) >>> 8) | (byt[3] << 24);
		return targets;
	}

	/**
	 * 整形转字节数组
	 * @param sourse
	 * @param target
	 */
	private void int2byte(int sourse, byte[] target) {
		target[0] = (byte) (sourse & 0xff);// 最低位
		target[1] = (byte) ((sourse >> 8) & 0xff);// 次低位
		target[2] = (byte) ((sourse >> 16) & 0xff);// 次高位
		target[3] = (byte) (sourse >>> 24);// 最高位,无符号右移。
	}
}