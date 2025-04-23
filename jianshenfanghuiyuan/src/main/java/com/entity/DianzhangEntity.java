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
 * 店长
 *
 * @author 
 * @email
 */
@TableName("dianzhang")
public class DianzhangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianzhangEntity() {

	}

	public DianzhangEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 店长姓名
     */
    @TableField(value = "dianzhang_name")

    private String dianzhangName;


    /**
     * 头像
     */
    @TableField(value = "dianzhang_photo")

    private String dianzhangPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "dianzhang_phone")

    private String dianzhangPhone;


    /**
     * 邮箱
     */
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 假删
     */
    @TableField(value = "yonghu_delete")

    private Integer yonghuDelete;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：店长姓名
	 */
    public String getDianzhangName() {
        return dianzhangName;
    }
    /**
	 * 获取：店长姓名
	 */

    public void setDianzhangName(String dianzhangName) {
        this.dianzhangName = dianzhangName;
    }
    /**
	 * 设置：头像
	 */
    public String getDianzhangPhoto() {
        return dianzhangPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setDianzhangPhoto(String dianzhangPhoto) {
        this.dianzhangPhoto = dianzhangPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getDianzhangPhone() {
        return dianzhangPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setDianzhangPhone(String dianzhangPhone) {
        this.dianzhangPhone = dianzhangPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getYonghuDelete() {
        return yonghuDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setYonghuDelete(Integer yonghuDelete) {
        this.yonghuDelete = yonghuDelete;
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
        return "Dianzhang{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", dianzhangName=" + dianzhangName +
            ", dianzhangPhoto=" + dianzhangPhoto +
            ", sexTypes=" + sexTypes +
            ", dianzhangPhone=" + dianzhangPhone +
            ", yonghuEmail=" + yonghuEmail +
            ", yonghuDelete=" + yonghuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
