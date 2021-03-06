package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class ActivityRecord implements Serializable {
    /**
     * 主键
     * 表字段 : activity_record.id
     */
    private Integer id;

    /**
     * 对应用户
     * 表字段 : activity_record.u_id
     */
    private String uId;

    /**
     * 交易表id
     * 表字段 : activity_record.t_id
     */
    private Integer tId;

    /**
     * 名称
     * 表字段 : activity_record.name
     */
    private String name;

    /**
     * 内容
     * 表字段 : activity_record.content
     */
    private String content;

    /**
     * 金额
     * 表字段 : activity_record.amount
     */
    private Integer amount;

    /**
     * 0，领宝；1，抵用券
     * 表字段 : activity_record.type
     */
    private Integer type;

    /**
     * 有效期
     * 表字段 : activity_record.validity
     */
    private Date validity;

    /**
     * 使用日期
     * 表字段 : activity_record.use_date
     */
    private Date useDate;

    /**
     * 0，已使用；1，未使用
     * 表字段 : activity_record.status
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:activity_record.id
     *
     * @return activity_record.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:activity_record.id
     *
     * @param id the value for activity_record.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 对应用户 字段:activity_record.u_id
     *
     * @return activity_record.u_id, 对应用户
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置 对应用户 字段:activity_record.u_id
     *
     * @param uId the value for activity_record.u_id, 对应用户
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 交易表id 字段:activity_record.t_id
     *
     * @return activity_record.t_id, 交易表id
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 设置 交易表id 字段:activity_record.t_id
     *
     * @param tId the value for activity_record.t_id, 交易表id
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 获取 名称 字段:activity_record.name
     *
     * @return activity_record.name, 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称 字段:activity_record.name
     *
     * @param name the value for activity_record.name, 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 内容 字段:activity_record.content
     *
     * @return activity_record.content, 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容 字段:activity_record.content
     *
     * @param content the value for activity_record.content, 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取 金额 字段:activity_record.amount
     *
     * @return activity_record.amount, 金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置 金额 字段:activity_record.amount
     *
     * @param amount the value for activity_record.amount, 金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取 0，领宝；1，抵用券 字段:activity_record.type
     *
     * @return activity_record.type, 0，领宝；1，抵用券
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 0，领宝；1，抵用券 字段:activity_record.type
     *
     * @param type the value for activity_record.type, 0，领宝；1，抵用券
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 有效期 字段:activity_record.validity
     *
     * @return activity_record.validity, 有效期
     */
    public Date getValidity() {
        return validity;
    }

    /**
     * 设置 有效期 字段:activity_record.validity
     *
     * @param validity the value for activity_record.validity, 有效期
     */
    public void setValidity(Date validity) {
        this.validity = validity;
    }

    /**
     * 获取 使用日期 字段:activity_record.use_date
     *
     * @return activity_record.use_date, 使用日期
     */
    public Date getUseDate() {
        return useDate;
    }

    /**
     * 设置 使用日期 字段:activity_record.use_date
     *
     * @param useDate the value for activity_record.use_date, 使用日期
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * 获取 0，已使用；1，未使用 字段:activity_record.status
     *
     * @return activity_record.status, 0，已使用；1，未使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 0，已使用；1，未使用 字段:activity_record.status
     *
     * @param status the value for activity_record.status, 0，已使用；1，未使用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ,activity_record
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", tId=").append(tId);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append(", validity=").append(validity);
        sb.append(", useDate=").append(useDate);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}