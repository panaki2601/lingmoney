package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class LingbaoLotteryRatio implements Serializable {
    /**
     * 主键
     * 表字段 : lingbao_lottery_ratio.id
     */
    private Integer id;

    /**
     * 领宝活动类型id
     * 表字段 : lingbao_lottery_ratio.type_id
     */
    private Integer typeId;

    /**
     * 礼品id
     * 表字段 : lingbao_lottery_ratio.gift_id
     */
    private Integer giftId;

    /**
     * 兑换所需领宝
     * 表字段 : lingbao_lottery_ratio.integral
     */
    private Integer integral;

    /**
     * 特惠积分
     * 表字段 : lingbao_lottery_ratio.preferential_integral
     */
    private Integer preferentialIntegral;

    /**
     * 鼓励语。不要灰心、再接再厉等等。
     * 表字段 : lingbao_lottery_ratio.word
     */
    private String word;

    /**
     * 占比
     * 表字段 : lingbao_lottery_ratio.ratio
     */
    private Double ratio;

    /**
     * 活动类型。0抽奖，1限时抢。
     * 表字段 : lingbao_lottery_ratio.type
     */
    private Integer type;

    /**
     * 状态。0不可用，1可用。
     * 表字段 : lingbao_lottery_ratio.status
     */
    private Integer status;

    /**
     * 领宝单位 0，个； 1，%
     * 表字段 : lingbao_lottery_ratio.unit
     */
    private Integer unit;

    /**
     * 展示排序 由小到大 默认999
     * 表字段 : lingbao_lottery_ratio.level
     */
    private Integer level;

    /**
     * 奖品级别 1：一等奖  2：二等奖 默认10
     * 表字段 : lingbao_lottery_ratio.prize_level
     */
    private Integer prizeLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lingbao_lottery_ratio
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:lingbao_lottery_ratio.id
     *
     * @return lingbao_lottery_ratio.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:lingbao_lottery_ratio.id
     *
     * @param id the value for lingbao_lottery_ratio.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 领宝活动类型id 字段:lingbao_lottery_ratio.type_id
     *
     * @return lingbao_lottery_ratio.type_id, 领宝活动类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置 领宝活动类型id 字段:lingbao_lottery_ratio.type_id
     *
     * @param typeId the value for lingbao_lottery_ratio.type_id, 领宝活动类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取 礼品id 字段:lingbao_lottery_ratio.gift_id
     *
     * @return lingbao_lottery_ratio.gift_id, 礼品id
     */
    public Integer getGiftId() {
        return giftId;
    }

    /**
     * 设置 礼品id 字段:lingbao_lottery_ratio.gift_id
     *
     * @param giftId the value for lingbao_lottery_ratio.gift_id, 礼品id
     */
    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    /**
     * 获取 兑换所需领宝 字段:lingbao_lottery_ratio.integral
     *
     * @return lingbao_lottery_ratio.integral, 兑换所需领宝
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置 兑换所需领宝 字段:lingbao_lottery_ratio.integral
     *
     * @param integral the value for lingbao_lottery_ratio.integral, 兑换所需领宝
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取 特惠积分 字段:lingbao_lottery_ratio.preferential_integral
     *
     * @return lingbao_lottery_ratio.preferential_integral, 特惠积分
     */
    public Integer getPreferentialIntegral() {
        return preferentialIntegral;
    }

    /**
     * 设置 特惠积分 字段:lingbao_lottery_ratio.preferential_integral
     *
     * @param preferentialIntegral the value for lingbao_lottery_ratio.preferential_integral, 特惠积分
     */
    public void setPreferentialIntegral(Integer preferentialIntegral) {
        this.preferentialIntegral = preferentialIntegral;
    }

    /**
     * 获取 鼓励语。不要灰心、再接再厉等等。 字段:lingbao_lottery_ratio.word
     *
     * @return lingbao_lottery_ratio.word, 鼓励语。不要灰心、再接再厉等等。
     */
    public String getWord() {
        return word;
    }

    /**
     * 设置 鼓励语。不要灰心、再接再厉等等。 字段:lingbao_lottery_ratio.word
     *
     * @param word the value for lingbao_lottery_ratio.word, 鼓励语。不要灰心、再接再厉等等。
     */
    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    /**
     * 获取 占比 字段:lingbao_lottery_ratio.ratio
     *
     * @return lingbao_lottery_ratio.ratio, 占比
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * 设置 占比 字段:lingbao_lottery_ratio.ratio
     *
     * @param ratio the value for lingbao_lottery_ratio.ratio, 占比
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取 活动类型。0抽奖，1限时抢。 字段:lingbao_lottery_ratio.type
     *
     * @return lingbao_lottery_ratio.type, 活动类型。0抽奖，1限时抢。
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 活动类型。0抽奖，1限时抢。 字段:lingbao_lottery_ratio.type
     *
     * @param type the value for lingbao_lottery_ratio.type, 活动类型。0抽奖，1限时抢。
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 状态。0不可用，1可用。 字段:lingbao_lottery_ratio.status
     *
     * @return lingbao_lottery_ratio.status, 状态。0不可用，1可用。
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态。0不可用，1可用。 字段:lingbao_lottery_ratio.status
     *
     * @param status the value for lingbao_lottery_ratio.status, 状态。0不可用，1可用。
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 领宝单位 0，个； 1，% 字段:lingbao_lottery_ratio.unit
     *
     * @return lingbao_lottery_ratio.unit, 领宝单位 0，个； 1，%
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * 设置 领宝单位 0，个； 1，% 字段:lingbao_lottery_ratio.unit
     *
     * @param unit the value for lingbao_lottery_ratio.unit, 领宝单位 0，个； 1，%
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 获取 展示排序 由小到大 默认999 字段:lingbao_lottery_ratio.level
     *
     * @return lingbao_lottery_ratio.level, 展示排序 由小到大 默认999
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 展示排序 由小到大 默认999 字段:lingbao_lottery_ratio.level
     *
     * @param level the value for lingbao_lottery_ratio.level, 展示排序 由小到大 默认999
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 奖品级别 1：一等奖  2：二等奖 默认10 字段:lingbao_lottery_ratio.prize_level
     *
     * @return lingbao_lottery_ratio.prize_level, 奖品级别 1：一等奖  2：二等奖 默认10
     */
    public Integer getPrizeLevel() {
        return prizeLevel;
    }

    /**
     * 设置 奖品级别 1：一等奖  2：二等奖 默认10 字段:lingbao_lottery_ratio.prize_level
     *
     * @param prizeLevel the value for lingbao_lottery_ratio.prize_level, 奖品级别 1：一等奖  2：二等奖 默认10
     */
    public void setPrizeLevel(Integer prizeLevel) {
        this.prizeLevel = prizeLevel;
    }

    /**
     * ,lingbao_lottery_ratio
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", giftId=").append(giftId);
        sb.append(", integral=").append(integral);
        sb.append(", preferentialIntegral=").append(preferentialIntegral);
        sb.append(", word=").append(word);
        sb.append(", ratio=").append(ratio);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", unit=").append(unit);
        sb.append(", level=").append(level);
        sb.append(", prizeLevel=").append(prizeLevel);
        sb.append("]");
        return sb.toString();
    }
}