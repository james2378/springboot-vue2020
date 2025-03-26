package com.entity.model;

import com.entity.BokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 博客信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BokeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 博客标题
     */
    private String bokeName;


    /**
     * 博客类型
     */
    private Integer bokeTypes;


    /**
     * 博客图片
     */
    private String bokePhoto;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 点击次数
     */
    private Integer clicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 博客内容
     */
    private String bokeContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：博客标题
	 */
    public String getBokeName() {
        return bokeName;
    }


    /**
	 * 设置：博客标题
	 */
    public void setBokeName(String bokeName) {
        this.bokeName = bokeName;
    }
    /**
	 * 获取：博客类型
	 */
    public Integer getBokeTypes() {
        return bokeTypes;
    }


    /**
	 * 设置：博客类型
	 */
    public void setBokeTypes(Integer bokeTypes) {
        this.bokeTypes = bokeTypes;
    }
    /**
	 * 获取：博客图片
	 */
    public String getBokePhoto() {
        return bokePhoto;
    }


    /**
	 * 设置：博客图片
	 */
    public void setBokePhoto(String bokePhoto) {
        this.bokePhoto = bokePhoto;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getClicknum() {
        return clicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：博客内容
	 */
    public String getBokeContent() {
        return bokeContent;
    }


    /**
	 * 设置：博客内容
	 */
    public void setBokeContent(String bokeContent) {
        this.bokeContent = bokeContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
