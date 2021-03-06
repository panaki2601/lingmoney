package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class ProductSubmit implements Serializable {
    /**
     * 
     * 表字段 : product_submit.id
     */
    private Integer id;

    /**
     * 回馈信息
     * 表字段 : product_submit.info
     */
    private String info;

    /**
     * 处理状态:0:待审批，1:审批退回,2:审批同意
     * 表字段 : product_submit.status
     */
    private Integer status;

    /**
     * 处理时间
     * 表字段 : product_submit.op_time
     */
    private Date opTime;

    /**
     * 产品id
     * 表字段 : product_submit.p_id
     */
    private Integer pId;

    /**
     * 产品名称
     * 表字段 : product_submit.p_name
     */
    private String pName;

    /**
     * 
     * 表字段 : product_submit.u_id
     */
    private String uId;

    /**
     * 操作的ip
     * 表字段 : product_submit.ip
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_submit
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:product_submit.id
     *
     * @return product_submit.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:product_submit.id
     *
     * @param id the value for product_submit.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 回馈信息 字段:product_submit.info
     *
     * @return product_submit.info, 回馈信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置 回馈信息 字段:product_submit.info
     *
     * @param info the value for product_submit.info, 回馈信息
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * 获取 处理状态:0:待审批，1:审批退回,2:审批同意 字段:product_submit.status
     *
     * @return product_submit.status, 处理状态:0:待审批，1:审批退回,2:审批同意
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 处理状态:0:待审批，1:审批退回,2:审批同意 字段:product_submit.status
     *
     * @param status the value for product_submit.status, 处理状态:0:待审批，1:审批退回,2:审批同意
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 处理时间 字段:product_submit.op_time
     *
     * @return product_submit.op_time, 处理时间
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * 设置 处理时间 字段:product_submit.op_time
     *
     * @param opTime the value for product_submit.op_time, 处理时间
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    /**
     * 获取 产品id 字段:product_submit.p_id
     *
     * @return product_submit.p_id, 产品id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置 产品id 字段:product_submit.p_id
     *
     * @param pId the value for product_submit.p_id, 产品id
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取 产品名称 字段:product_submit.p_name
     *
     * @return product_submit.p_name, 产品名称
     */
    public String getpName() {
        return pName;
    }

    /**
     * 设置 产品名称 字段:product_submit.p_name
     *
     * @param pName the value for product_submit.p_name, 产品名称
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    /**
     * 获取  字段:product_submit.u_id
     *
     * @return product_submit.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:product_submit.u_id
     *
     * @param uId the value for product_submit.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 操作的ip 字段:product_submit.ip
     *
     * @return product_submit.ip, 操作的ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置 操作的ip 字段:product_submit.ip
     *
     * @param ip the value for product_submit.ip, 操作的ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * ,product_submit
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", info=").append(info);
        sb.append(", status=").append(status);
        sb.append(", opTime=").append(opTime);
        sb.append(", pId=").append(pId);
        sb.append(", pName=").append(pName);
        sb.append(", uId=").append(uId);
        sb.append(", ip=").append(ip);
        sb.append("]");
        return sb.toString();
    }
}