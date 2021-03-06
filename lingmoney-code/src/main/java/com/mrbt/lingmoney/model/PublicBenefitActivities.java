package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class PublicBenefitActivities implements Serializable {
    /**
     * 数据ID
     * 表字段 : public_benefit_activities.id
     */
    private Integer id;

    /**
     * 公益活动简介
     * 表字段 : public_benefit_activities.pba_desc
     */
    private String pbaDesc;

    /**
     * 图片
     * 表字段 : public_benefit_activities.pba_picture
     */
    private String pbaPicture;

    /**
     * 礼赞上限
     * 表字段 : public_benefit_activities.max_praise
     */
    private Integer maxPraise;

    /**
     * 已礼赞
     * 表字段 : public_benefit_activities.sum_praise
     */
    private Integer sumPraise;

    /**
     * 状态，0：初始化，1：发布，2：已完成
     * 表字段 : public_benefit_activities.status
     */
    private Integer status;

    /**
     * 显示开始时间
     * 表字段 : public_benefit_activities.state_time
     */
    private Date stateTime;

    /**
     * 显示结束时间
     * 表字段 : public_benefit_activities.end_time
     */
    private Date endTime;

    /**
     * 排序
     * 表字段 : public_benefit_activities.sort
     */
    private Integer sort;

    /**
     * 创建时间
     * 表字段 : public_benefit_activities.create_time
     */
    private Date createTime;

    /**
     * 公益名称
     * 表字段 : public_benefit_activities.pba_name
     */
    private String pbaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 数据ID 字段:public_benefit_activities.id
     *
     * @return public_benefit_activities.id, 数据ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 数据ID 字段:public_benefit_activities.id
     *
     * @param id the value for public_benefit_activities.id, 数据ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 公益活动简介 字段:public_benefit_activities.pba_desc
     *
     * @return public_benefit_activities.pba_desc, 公益活动简介
     */
    public String getPbaDesc() {
        return pbaDesc;
    }

    /**
     * 设置 公益活动简介 字段:public_benefit_activities.pba_desc
     *
     * @param pbaDesc the value for public_benefit_activities.pba_desc, 公益活动简介
     */
    public void setPbaDesc(String pbaDesc) {
        this.pbaDesc = pbaDesc == null ? null : pbaDesc.trim();
    }

    /**
     * 获取 图片 字段:public_benefit_activities.pba_picture
     *
     * @return public_benefit_activities.pba_picture, 图片
     */
    public String getPbaPicture() {
        return pbaPicture;
    }

    /**
     * 设置 图片 字段:public_benefit_activities.pba_picture
     *
     * @param pbaPicture the value for public_benefit_activities.pba_picture, 图片
     */
    public void setPbaPicture(String pbaPicture) {
        this.pbaPicture = pbaPicture == null ? null : pbaPicture.trim();
    }

    /**
     * 获取 礼赞上限 字段:public_benefit_activities.max_praise
     *
     * @return public_benefit_activities.max_praise, 礼赞上限
     */
    public Integer getMaxPraise() {
        return maxPraise;
    }

    /**
     * 设置 礼赞上限 字段:public_benefit_activities.max_praise
     *
     * @param maxPraise the value for public_benefit_activities.max_praise, 礼赞上限
     */
    public void setMaxPraise(Integer maxPraise) {
        this.maxPraise = maxPraise;
    }

    /**
     * 获取 已礼赞 字段:public_benefit_activities.sum_praise
     *
     * @return public_benefit_activities.sum_praise, 已礼赞
     */
    public Integer getSumPraise() {
        return sumPraise;
    }

    /**
     * 设置 已礼赞 字段:public_benefit_activities.sum_praise
     *
     * @param sumPraise the value for public_benefit_activities.sum_praise, 已礼赞
     */
    public void setSumPraise(Integer sumPraise) {
        this.sumPraise = sumPraise;
    }

    /**
     * 获取 状态，0：初始化，1：发布，2：已完成 字段:public_benefit_activities.status
     *
     * @return public_benefit_activities.status, 状态，0：初始化，1：发布，2：已完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态，0：初始化，1：发布，2：已完成 字段:public_benefit_activities.status
     *
     * @param status the value for public_benefit_activities.status, 状态，0：初始化，1：发布，2：已完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 显示开始时间 字段:public_benefit_activities.state_time
     *
     * @return public_benefit_activities.state_time, 显示开始时间
     */
    public Date getStateTime() {
        return stateTime;
    }

    /**
     * 设置 显示开始时间 字段:public_benefit_activities.state_time
     *
     * @param stateTime the value for public_benefit_activities.state_time, 显示开始时间
     */
    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }

    /**
     * 获取 显示结束时间 字段:public_benefit_activities.end_time
     *
     * @return public_benefit_activities.end_time, 显示结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置 显示结束时间 字段:public_benefit_activities.end_time
     *
     * @param endTime the value for public_benefit_activities.end_time, 显示结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 排序 字段:public_benefit_activities.sort
     *
     * @return public_benefit_activities.sort, 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置 排序 字段:public_benefit_activities.sort
     *
     * @param sort the value for public_benefit_activities.sort, 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 创建时间 字段:public_benefit_activities.create_time
     *
     * @return public_benefit_activities.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:public_benefit_activities.create_time
     *
     * @param createTime the value for public_benefit_activities.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 公益名称 字段:public_benefit_activities.pba_name
     *
     * @return public_benefit_activities.pba_name, 公益名称
     */
    public String getPbaName() {
        return pbaName;
    }

    /**
     * 设置 公益名称 字段:public_benefit_activities.pba_name
     *
     * @param pbaName the value for public_benefit_activities.pba_name, 公益名称
     */
    public void setPbaName(String pbaName) {
        this.pbaName = pbaName == null ? null : pbaName.trim();
    }

    /**
     * ,public_benefit_activities
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pbaDesc=").append(pbaDesc);
        sb.append(", pbaPicture=").append(pbaPicture);
        sb.append(", maxPraise=").append(maxPraise);
        sb.append(", sumPraise=").append(sumPraise);
        sb.append(", status=").append(status);
        sb.append(", stateTime=").append(stateTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", pbaName=").append(pbaName);
        sb.append("]");
        return sb.toString();
    }
}