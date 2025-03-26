package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 博客信息
 *
 * @author 
 * @email
 */
@TableName("boke")
public class BokeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BokeEntity() {

	}

	public BokeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 博客标题
     */
    @TableField(value = "boke_name")

    private String bokeName;


    /**
     * 博客类型
     */
    @TableField(value = "boke_types")

    private Integer bokeTypes;


    /**
     * 博客图片
     */
    @TableField(value = "boke_photo")

    private String bokePhoto;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "clicknum")

    private Integer clicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 博客内容
     */
    @TableField(value = "boke_content")

    private String bokeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：博客标题
	 */
    public String getBokeName() {
        return bokeName;
    }


    /**
	 * 获取：博客标题
	 */

    public void setBokeName(String bokeName) {
        this.bokeName = bokeName;
    }
    /**
	 * 设置：博客类型
	 */
    public Integer getBokeTypes() {
        return bokeTypes;
    }


    /**
	 * 获取：博客类型
	 */

    public void setBokeTypes(Integer bokeTypes) {
        this.bokeTypes = bokeTypes;
    }
    /**
	 * 设置：博客图片
	 */
    public String getBokePhoto() {
        return bokePhoto;
    }


    /**
	 * 获取：博客图片
	 */

    public void setBokePhoto(String bokePhoto) {
        this.bokePhoto = bokePhoto;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getClicknum() {
        return clicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：博客内容
	 */
    public String getBokeContent() {
        return bokeContent;
    }


    /**
	 * 获取：博客内容
	 */

    public void setBokeContent(String bokeContent) {
        this.bokeContent = bokeContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Boke{" +
            "id=" + id +
            ", bokeName=" + bokeName +
            ", bokeTypes=" + bokeTypes +
            ", bokePhoto=" + bokePhoto +
            ", yonghuId=" + yonghuId +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", clicknum=" + clicknum +
            ", insertTime=" + insertTime +
            ", bokeContent=" + bokeContent +
            ", createTime=" + createTime +
        "}";
    }
}
