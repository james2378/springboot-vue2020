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
 * 书籍信息
 *
 * @author 
 * @email
 */
@TableName("shuji")
public class ShujiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShujiEntity() {

	}

	public ShujiEntity(T t) {
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
     * 书籍标题
     */
    @TableField(value = "shuji_name")

    private String shujiName;


    /**
     * 书籍类别
     */
    @TableField(value = "shuji_types")

    private Integer shujiTypes;


    /**
     * 书籍图片
     */
    @TableField(value = "shuji_photo")

    private String shujiPhoto;


    /**
     * 书籍下载
     */
    @TableField(value = "shuji_file")

    private String shujiFile;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 点击次数
     */
    @TableField(value = "shuji_clicknum")

    private Integer shujiClicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 书籍详情
     */
    @TableField(value = "shuji_content")

    private String shujiContent;


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
	 * 设置：书籍标题
	 */
    public String getShujiName() {
        return shujiName;
    }


    /**
	 * 获取：书籍标题
	 */

    public void setShujiName(String shujiName) {
        this.shujiName = shujiName;
    }
    /**
	 * 设置：书籍类别
	 */
    public Integer getShujiTypes() {
        return shujiTypes;
    }


    /**
	 * 获取：书籍类别
	 */

    public void setShujiTypes(Integer shujiTypes) {
        this.shujiTypes = shujiTypes;
    }
    /**
	 * 设置：书籍图片
	 */
    public String getShujiPhoto() {
        return shujiPhoto;
    }


    /**
	 * 获取：书籍图片
	 */

    public void setShujiPhoto(String shujiPhoto) {
        this.shujiPhoto = shujiPhoto;
    }
    /**
	 * 设置：书籍下载
	 */
    public String getShujiFile() {
        return shujiFile;
    }


    /**
	 * 获取：书籍下载
	 */

    public void setShujiFile(String shujiFile) {
        this.shujiFile = shujiFile;
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
	 * 设置：点击次数
	 */
    public Integer getShujiClicknum() {
        return shujiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setShujiClicknum(Integer shujiClicknum) {
        this.shujiClicknum = shujiClicknum;
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
	 * 设置：书籍详情
	 */
    public String getShujiContent() {
        return shujiContent;
    }


    /**
	 * 获取：书籍详情
	 */

    public void setShujiContent(String shujiContent) {
        this.shujiContent = shujiContent;
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
        return "Shuji{" +
            "id=" + id +
            ", shujiName=" + shujiName +
            ", shujiTypes=" + shujiTypes +
            ", shujiPhoto=" + shujiPhoto +
            ", shujiFile=" + shujiFile +
            ", yonghuId=" + yonghuId +
            ", shujiClicknum=" + shujiClicknum +
            ", insertTime=" + insertTime +
            ", shujiContent=" + shujiContent +
            ", createTime=" + createTime +
        "}";
    }
}
