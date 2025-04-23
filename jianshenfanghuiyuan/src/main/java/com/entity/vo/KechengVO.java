package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教练
     */

    @TableField(value = "jiaolian_id")
    private Integer jiaolianId;


    /**
     * 课程名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 课程封面
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 购买获得积分
     */

    @TableField(value = "kecheng_price")
    private Integer kechengPrice;


    /**
     * 课程类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 可预约人数
     */

    @TableField(value = "kecheng_kucun_number")
    private Integer kechengKucunNumber;


    /**
     * 价格
     */

    @TableField(value = "kecheng_new_money")
    private Double kechengNewMoney;


    /**
     * 逻辑删除
     */

    @TableField(value = "kecheng_delete")
    private Integer kechengDelete;


    /**
     * 课程简介
     */

    @TableField(value = "kecheng_content")
    private String kechengContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getKechengPrice() {
        return kechengPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setKechengPrice(Integer kechengPrice) {
        this.kechengPrice = kechengPrice;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：可预约人数
	 */
    public Integer getKechengKucunNumber() {
        return kechengKucunNumber;
    }


    /**
	 * 获取：可预约人数
	 */

    public void setKechengKucunNumber(Integer kechengKucunNumber) {
        this.kechengKucunNumber = kechengKucunNumber;
    }
    /**
	 * 设置：价格
	 */
    public Double getKechengNewMoney() {
        return kechengNewMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setKechengNewMoney(Double kechengNewMoney) {
        this.kechengNewMoney = kechengNewMoney;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 设置：课程简介
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：课程简介
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
