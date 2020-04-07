package com.visionvera.bean.dispatchment;

import java.io.Serializable;

/**
 * Created by zwl on 2018/3/12.
 */

public class RemoteClientBean implements Serializable {


    private String BoxNumber;
    private int DeviceId;
    private String LinkID;
    private int MessageType;
    private String MpName;
    private String Order;
    private int SystemType;
    private String Userid;
    private int islock;
    private String videono;
    private int videotype;

    public String getBoxNumber() {
        return BoxNumber;
    }

    public void setBoxNumber(String BoxNumber) {
        this.BoxNumber = BoxNumber;
    }

    public int getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(int DeviceId) {
        this.DeviceId = DeviceId;
    }

    public String getLinkID() {
        return LinkID;
    }

    public void setLinkID(String LinkID) {
        this.LinkID = LinkID;
    }

    public int getMessageType() {
        return MessageType;
    }

    public void setMessageType(int MessageType) {
        this.MessageType = MessageType;
    }

    public String getMpName() {
        return MpName;
    }

    public void setMpName(String MpName) {
        this.MpName = MpName;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String Order) {
        this.Order = Order;
    }

    public int getSystemType() {
        return SystemType;
    }

    public void setSystemType(int SystemType) {
        this.SystemType = SystemType;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public int getIslock() {
        return islock;
    }

    public void setIslock(int islock) {
        this.islock = islock;
    }

    public String getVideono() {
        return videono;
    }

    public void setVideono(String videono) {
        this.videono = videono;
    }

    public int getVideotype() {
        return videotype;
    }

    public void setVideotype(int videotype) {
        this.videotype = videotype;
    }
}
