package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentPartition implements Serializable {
    /**
     * 
     * 表字段 : payment_partition.id
     */
    private Integer id;

    /**
     * 订单号(兑付的订单号，主)
     * 表字段 : payment_partition.out_biz_code
     */
    private String outBizCode;

    /**
     * index位置
     * 表字段 : payment_partition.partition_index
     */
    private Integer partitionIndex;

    /**
     * 子订单号，以订单号+顺序数字递增
     * 表字段 : payment_partition.out_biz_code_partition
     */
    private String outBizCodePartition;

    /**
     * 订单类型，1是稳赢宝，2是随心取全部赎回，3是随心取部分赎回
     * 表字段 : payment_partition.biz_type
     */
    private String bizType;

    /**
     * 
     * 表字段 : payment_partition.u_id
     */
    private String uId;

    /**
     * 业务id，可以记录trading的id，也可以记录流水表的id，程序员自己定
     * 表字段 : payment_partition.biz_id
     */
    private Integer bizId;

    /**
     * 用户手机号
     * 表字段 : payment_partition.user_telphone
     */
    private String userTelphone;

    /**
     * 用户姓名
     * 表字段 : payment_partition.user_name
     */
    private String userName;

    /**
     * 用户卡号
     * 表字段 : payment_partition.user_card_no
     */
    private String userCardNo;

    /**
     * 用户卡的短称
     * 表字段 : payment_partition.user_card_short
     */
    private String userCardShort;

    /**
     * 用户兑付的金额
     * 表字段 : payment_partition.user_amount
     */
    private BigDecimal userAmount;

    /**
     * 状态信息，0:初始化状态，3：成功，15：等待，16：失败
     * 表字段 : payment_partition.status
     */
    private Integer status;

    /**
     * 
     * 表字段 : payment_partition.oper_time
     */
    private Date operTime;

    /**
     * 
     * 表字段 : payment_partition.reach_time
     */
    private Date reachTime;

    /**
     * 京东返回的信息
     * 表字段 : payment_partition.response_msg
     */
    private String responseMsg;

    /**
     * 确认赎回，0未确认，1确认
     * 表字段 : payment_partition.submit
     */
    private Integer submit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table payment_partition
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:payment_partition.id
     *
     * @return payment_partition.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:payment_partition.id
     *
     * @param id the value for payment_partition.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 订单号(兑付的订单号，主) 字段:payment_partition.out_biz_code
     *
     * @return payment_partition.out_biz_code, 订单号(兑付的订单号，主)
     */
    public String getOutBizCode() {
        return outBizCode;
    }

    /**
     * 设置 订单号(兑付的订单号，主) 字段:payment_partition.out_biz_code
     *
     * @param outBizCode the value for payment_partition.out_biz_code, 订单号(兑付的订单号，主)
     */
    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode == null ? null : outBizCode.trim();
    }

    /**
     * 获取 index位置 字段:payment_partition.partition_index
     *
     * @return payment_partition.partition_index, index位置
     */
    public Integer getPartitionIndex() {
        return partitionIndex;
    }

    /**
     * 设置 index位置 字段:payment_partition.partition_index
     *
     * @param partitionIndex the value for payment_partition.partition_index, index位置
     */
    public void setPartitionIndex(Integer partitionIndex) {
        this.partitionIndex = partitionIndex;
    }

    /**
     * 获取 子订单号，以订单号+顺序数字递增 字段:payment_partition.out_biz_code_partition
     *
     * @return payment_partition.out_biz_code_partition, 子订单号，以订单号+顺序数字递增
     */
    public String getOutBizCodePartition() {
        return outBizCodePartition;
    }

    /**
     * 设置 子订单号，以订单号+顺序数字递增 字段:payment_partition.out_biz_code_partition
     *
     * @param outBizCodePartition the value for payment_partition.out_biz_code_partition, 子订单号，以订单号+顺序数字递增
     */
    public void setOutBizCodePartition(String outBizCodePartition) {
        this.outBizCodePartition = outBizCodePartition == null ? null : outBizCodePartition.trim();
    }

    /**
     * 获取 订单类型，1是稳赢宝，2是随心取全部赎回，3是随心取部分赎回 字段:payment_partition.biz_type
     *
     * @return payment_partition.biz_type, 订单类型，1是稳赢宝，2是随心取全部赎回，3是随心取部分赎回
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * 设置 订单类型，1是稳赢宝，2是随心取全部赎回，3是随心取部分赎回 字段:payment_partition.biz_type
     *
     * @param bizType the value for payment_partition.biz_type, 订单类型，1是稳赢宝，2是随心取全部赎回，3是随心取部分赎回
     */
    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    /**
     * 获取  字段:payment_partition.u_id
     *
     * @return payment_partition.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:payment_partition.u_id
     *
     * @param uId the value for payment_partition.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 业务id，可以记录trading的id，也可以记录流水表的id，程序员自己定 字段:payment_partition.biz_id
     *
     * @return payment_partition.biz_id, 业务id，可以记录trading的id，也可以记录流水表的id，程序员自己定
     */
    public Integer getBizId() {
        return bizId;
    }

    /**
     * 设置 业务id，可以记录trading的id，也可以记录流水表的id，程序员自己定 字段:payment_partition.biz_id
     *
     * @param bizId the value for payment_partition.biz_id, 业务id，可以记录trading的id，也可以记录流水表的id，程序员自己定
     */
    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    /**
     * 获取 用户手机号 字段:payment_partition.user_telphone
     *
     * @return payment_partition.user_telphone, 用户手机号
     */
    public String getUserTelphone() {
        return userTelphone;
    }

    /**
     * 设置 用户手机号 字段:payment_partition.user_telphone
     *
     * @param userTelphone the value for payment_partition.user_telphone, 用户手机号
     */
    public void setUserTelphone(String userTelphone) {
        this.userTelphone = userTelphone == null ? null : userTelphone.trim();
    }

    /**
     * 获取 用户姓名 字段:payment_partition.user_name
     *
     * @return payment_partition.user_name, 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户姓名 字段:payment_partition.user_name
     *
     * @param userName the value for payment_partition.user_name, 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 用户卡号 字段:payment_partition.user_card_no
     *
     * @return payment_partition.user_card_no, 用户卡号
     */
    public String getUserCardNo() {
        return userCardNo;
    }

    /**
     * 设置 用户卡号 字段:payment_partition.user_card_no
     *
     * @param userCardNo the value for payment_partition.user_card_no, 用户卡号
     */
    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo == null ? null : userCardNo.trim();
    }

    /**
     * 获取 用户卡的短称 字段:payment_partition.user_card_short
     *
     * @return payment_partition.user_card_short, 用户卡的短称
     */
    public String getUserCardShort() {
        return userCardShort;
    }

    /**
     * 设置 用户卡的短称 字段:payment_partition.user_card_short
     *
     * @param userCardShort the value for payment_partition.user_card_short, 用户卡的短称
     */
    public void setUserCardShort(String userCardShort) {
        this.userCardShort = userCardShort == null ? null : userCardShort.trim();
    }

    /**
     * 获取 用户兑付的金额 字段:payment_partition.user_amount
     *
     * @return payment_partition.user_amount, 用户兑付的金额
     */
    public BigDecimal getUserAmount() {
        return userAmount;
    }

    /**
     * 设置 用户兑付的金额 字段:payment_partition.user_amount
     *
     * @param userAmount the value for payment_partition.user_amount, 用户兑付的金额
     */
    public void setUserAmount(BigDecimal userAmount) {
        this.userAmount = userAmount;
    }

    /**
     * 获取 状态信息，0:初始化状态，3：成功，15：等待，16：失败 字段:payment_partition.status
     *
     * @return payment_partition.status, 状态信息，0:初始化状态，3：成功，15：等待，16：失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态信息，0:初始化状态，3：成功，15：等待，16：失败 字段:payment_partition.status
     *
     * @param status the value for payment_partition.status, 状态信息，0:初始化状态，3：成功，15：等待，16：失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:payment_partition.oper_time
     *
     * @return payment_partition.oper_time, 
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * 设置  字段:payment_partition.oper_time
     *
     * @param operTime the value for payment_partition.oper_time, 
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * 获取  字段:payment_partition.reach_time
     *
     * @return payment_partition.reach_time, 
     */
    public Date getReachTime() {
        return reachTime;
    }

    /**
     * 设置  字段:payment_partition.reach_time
     *
     * @param reachTime the value for payment_partition.reach_time, 
     */
    public void setReachTime(Date reachTime) {
        this.reachTime = reachTime;
    }

    /**
     * 获取 京东返回的信息 字段:payment_partition.response_msg
     *
     * @return payment_partition.response_msg, 京东返回的信息
     */
    public String getResponseMsg() {
        return responseMsg;
    }

    /**
     * 设置 京东返回的信息 字段:payment_partition.response_msg
     *
     * @param responseMsg the value for payment_partition.response_msg, 京东返回的信息
     */
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg == null ? null : responseMsg.trim();
    }

    /**
     * 获取 确认赎回，0未确认，1确认 字段:payment_partition.submit
     *
     * @return payment_partition.submit, 确认赎回，0未确认，1确认
     */
    public Integer getSubmit() {
        return submit;
    }

    /**
     * 设置 确认赎回，0未确认，1确认 字段:payment_partition.submit
     *
     * @param submit the value for payment_partition.submit, 确认赎回，0未确认，1确认
     */
    public void setSubmit(Integer submit) {
        this.submit = submit;
    }

    /**
     * ,payment_partition
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outBizCode=").append(outBizCode);
        sb.append(", partitionIndex=").append(partitionIndex);
        sb.append(", outBizCodePartition=").append(outBizCodePartition);
        sb.append(", bizType=").append(bizType);
        sb.append(", uId=").append(uId);
        sb.append(", bizId=").append(bizId);
        sb.append(", userTelphone=").append(userTelphone);
        sb.append(", userName=").append(userName);
        sb.append(", userCardNo=").append(userCardNo);
        sb.append(", userCardShort=").append(userCardShort);
        sb.append(", userAmount=").append(userAmount);
        sb.append(", status=").append(status);
        sb.append(", operTime=").append(operTime);
        sb.append(", reachTime=").append(reachTime);
        sb.append(", responseMsg=").append(responseMsg);
        sb.append(", submit=").append(submit);
        sb.append("]");
        return sb.toString();
    }
}