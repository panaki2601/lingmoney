package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class FinancialManagement implements Serializable {
    /**
     * 
     * 表字段 : financial_management.id
     */
    private Integer id;

    /**
     * 标题
     * 表字段 : financial_management.title
     */
    private String title;

    /**
     * 主页图片路径
     * 表字段 : financial_management.index_pic
     */
    private String indexPic;

    /**
     * 发布时间
     * 表字段 : financial_management.pub_date
     */
    private Date pubDate;

    /**
     * 
     * 表字段 : financial_management.u_id
     */
    private String uId;

    /**
     * 
     * 表字段 : financial_management.u_name
     */
    private String uName;

    /**
     * 状态0未发布 1已发布
     * 表字段 : financial_management.status
     */
    private Integer status;

    /**
     * u_id	int	11	0	-1	0	0	0	0		0					0	0
     * 表字段 : financial_management.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table financial_management
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:financial_management.id
     *
     * @return financial_management.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:financial_management.id
     *
     * @param id the value for financial_management.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标题 字段:financial_management.title
     *
     * @return financial_management.title, 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 标题 字段:financial_management.title
     *
     * @param title the value for financial_management.title, 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 主页图片路径 字段:financial_management.index_pic
     *
     * @return financial_management.index_pic, 主页图片路径
     */
    public String getIndexPic() {
        return indexPic;
    }

    /**
     * 设置 主页图片路径 字段:financial_management.index_pic
     *
     * @param indexPic the value for financial_management.index_pic, 主页图片路径
     */
    public void setIndexPic(String indexPic) {
        this.indexPic = indexPic == null ? null : indexPic.trim();
    }

    /**
     * 获取 发布时间 字段:financial_management.pub_date
     *
     * @return financial_management.pub_date, 发布时间
     */
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * 设置 发布时间 字段:financial_management.pub_date
     *
     * @param pubDate the value for financial_management.pub_date, 发布时间
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * 获取  字段:financial_management.u_id
     *
     * @return financial_management.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:financial_management.u_id
     *
     * @param uId the value for financial_management.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取  字段:financial_management.u_name
     *
     * @return financial_management.u_name, 
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置  字段:financial_management.u_name
     *
     * @param uName the value for financial_management.u_name, 
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * 获取 状态0未发布 1已发布 字段:financial_management.status
     *
     * @return financial_management.status, 状态0未发布 1已发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0未发布 1已发布 字段:financial_management.status
     *
     * @param status the value for financial_management.status, 状态0未发布 1已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 u_id	int	11	0	-1	0	0	0	0		0					0	0 字段:financial_management.content
     *
     * @return financial_management.content, u_id	int	11	0	-1	0	0	0	0		0					0	0
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 u_id	int	11	0	-1	0	0	0	0		0					0	0 字段:financial_management.content
     *
     * @param content the value for financial_management.content, u_id	int	11	0	-1	0	0	0	0		0					0	0
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,financial_management
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", indexPic=").append(indexPic);
        sb.append(", pubDate=").append(pubDate);
        sb.append(", uId=").append(uId);
        sb.append(", uName=").append(uName);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}