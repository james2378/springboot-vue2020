package com.entity.vo;

import com.entity.ShujiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 书籍信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shuji")
public class ShujiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 书籍详情
     */

    @TableField(value = "shuji_content")
    private String shujiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
