package com.visionvera.bean.datacore;

/**
 * @ClassName applyMeetingLog
 * @Description TODO 申请入会log
 * @Author 徐鑫辉
 * @Date 2019年10月22日 17:15
 **/
public class ApplyMeetingLog {


    /**
     * cmd值 mq消息标识
     */
    private final Integer cmd =16800;
    /**
     * 唯一键
     */
    private String uuid;

    /**
     * 会议id
     */
    private String scheduleId;

    /**
     * 终端号
     */
    private String devNo;

    /**
     * 终端区号
     */
    private String zoneno;

    /**
     * 申请入会用户id
     */
    private String applyUserId;

    /**
     * 会议主席id
     */
    private String masterId;

    /**
     * 会议类型
     */
    private Integer meetingType;

    /**
     * 申请入会次数
     */
    private Integer applyCount;

    /**
     * 申请时间
     */
    private String createTime;

    /**
     * 0:加入或者1:退出
     */
    private Integer applyInOutMeeting;

    /**
     * 0:同意或者1:拒绝
     */
    private Integer agreementState;

    /**
     * 退出次数
     */
    private Integer quitCount;

    /**
     * 终端号+类型+角色
     */
    private String terminalDevices;

    /**
     * 终端名字
     */
    private String terminalName;

    /**
     * 终端别名
     */
    private String terminalAlias;


    public String getTerminalDevices() {
        return terminalDevices;
    }

    public void setTerminalDevices(String terminalDevices) {
        this.terminalDevices = terminalDevices;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getTerminalAlias() {
        return terminalAlias;
    }

    public void setTerminalAlias(String terminalAlias) {
        this.terminalAlias = terminalAlias;
    }

    public Integer getCmd() {
        return cmd;
    }

    public Integer getQuitCount() {
        return quitCount;
    }

    public void setQuitCount(Integer quitCount) {
        this.quitCount = quitCount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getDevNo() {
        return devNo;
    }

    public void setDevNo(String devNo) {
        this.devNo = devNo;
    }

    public String getZoneno() {
        return zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public Integer getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Integer meetingType) {
        this.meetingType = meetingType;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getApplyInOutMeeting() {
        return applyInOutMeeting;
    }

    public void setApplyInOutMeeting(Integer applyInOutMeeting) {
        this.applyInOutMeeting = applyInOutMeeting;
    }

    public Integer getAgreementState() {
        return agreementState;
    }

    public void setAgreementState(Integer agreementState) {
        this.agreementState = agreementState;
    }
}
