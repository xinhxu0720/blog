package com.visionvera.util;

public class IDWorker {

	private long workerId =2;

	private final static long twepoch = 1361753741828L;
	private long sequence = 0L;
	private final static long workerIdBits = 4L;
	public final static long maxWorkerId = -1L ^ (-1L << workerIdBits);
	private final static long sequenceBits = 10L;
	private final static long workerIdShift = sequenceBits;
	private final static long timestampLeftShift = sequenceBits + workerIdBits;
	public final static long sequenceMask = -1L ^ (-1L << sequenceBits);
	private long lastTimestamp = -1L;
	private volatile static IDWorker idWorker = null;
	
	private IDWorker(){
		
	}
	
	public static IDWorker getInstance(){
		if(idWorker == null){
			synchronized(IDWorker.class){
				if(idWorker == null){
					idWorker = new IDWorker();
				}
			}
		}
		return idWorker;
	}
	
	public void setWorkerId(long workerId) {
		if (workerId > IDWorker.maxWorkerId || workerId < 0) {
			throw new IllegalArgumentException(String.format(
			"worker Id can't be greater than %d or less than 0",
			IDWorker.maxWorkerId));
		}
		this.workerId = workerId;
	}

	public synchronized long nextId() {
		long timestamp = this.timeGen();
		if (this.lastTimestamp == timestamp) {
			this.sequence = (this.sequence + 1) & IDWorker.sequenceMask;
			if (this.sequence == 0) {
				System.out.println("###########" + sequenceMask);
				timestamp = this.tilNextMillis(this.lastTimestamp);
			}
		} else {
			this.sequence = 0;
		}
		if (timestamp < this.lastTimestamp) {
			try {
				throw new Exception(
						String.format(
								"Clock moved backwards.  Refusing to generate id for %d milliseconds",
								this.lastTimestamp - timestamp));
			} catch (Exception e) {
			}
		}

		this.lastTimestamp = timestamp;
		long nextId = ((timestamp - twepoch << timestampLeftShift))
		| (this.workerId << IDWorker.workerIdShift) | (this.sequence);
		// System.out.println("timestamp:" + timestamp + ",timestampLeftShift:"
		// + timestampLeftShift + ",nextId:" + nextId + ",workerId:"
		// + workerId + ",sequence:" + sequence);
		return nextId;
	}

	private long tilNextMillis(final long lastTimestamp) {
		long timestamp = this.timeGen();
		while (timestamp <= lastTimestamp) {
			timestamp = this.timeGen();
		}
		return timestamp;
	}

	private long timeGen() {
		return System.currentTimeMillis();
	}

	public static void main(String[] args) {
		System.out.println(IDWorker.getInstance().nextId());
		System.out.println(IDWorker.getInstance().nextId());
		System.out.println(IDWorker.getInstance().nextId());
	}
}