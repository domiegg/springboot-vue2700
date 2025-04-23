package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教练
     */
    private Integer jiaolianId;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程封面
     */
    private String kechengPhoto;


    /**
     * 购买获得积分
     */
    private Integer kechengPrice;


    /**
     * 课程类型
     */
    private Integer kechengTypes;


    /**
     * 可预约人数
     */
    private Integer kechengKucunNumber;


    /**
     * 价格
     */
    private Double kechengNewMoney;


    /**
     * 逻辑删除
     */
    private Integer kechengDelete;


    /**
     * 课程简介
     */
    private String kechengContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 设置：教练
	 */
    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程封面
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：购买获得积分
	 */
    public Integer getKechengPrice() {
        return kechengPrice;
    }


    /**
	 * 设置：购买获得积分
	 */
    public void setKechengPrice(Integer kechengPrice) {
        this.kechengPrice = kechengPrice;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：可预约人数
	 */
    public Integer getKechengKucunNumber() {
        return kechengKucunNumber;
    }


    /**
	 * 设置：可预约人数
	 */
    public void setKechengKucunNumber(Integer kechengKucunNumber) {
        this.kechengKucunNumber = kechengKucunNumber;
    }
    /**
	 * 获取：价格
	 */
    public Double getKechengNewMoney() {
        return kechengNewMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setKechengNewMoney(Double kechengNewMoney) {
        this.kechengNewMoney = kechengNewMoney;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 获取：课程简介
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程简介
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
