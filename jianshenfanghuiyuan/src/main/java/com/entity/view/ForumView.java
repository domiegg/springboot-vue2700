package com.entity.view;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 论坛
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 帖子状态的值
		*/
		private String forumStateValue;



		//级联表 dianzhang
			/**
			* 店长姓名
			*/
			private String dianzhangName;
			/**
			* 头像
			*/
			private String dianzhangPhoto;
			/**
			* 联系方式
			*/
			private String dianzhangPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 jiaolian
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 头像
			*/
			private String jiaolianPhoto;
			/**
			* 联系方式
			*/
			private String jiaolianPhone;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 现积分
			*/
			private Double yonghuJifen;
			/**
			* 会员类型
			*/
			private Integer huanyuanTypes;
				/**
				* 会员类型的值
				*/
				private String huanyuanValue;
			/**
			* 年费会员到期时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date huiyuandaoqiTime;

		//级联表 users
			/**
			* 用户名
			*/
			private String uusername;
			/**
			* 密码
			*/
			private String upassword;
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 帖子状态的值
			*/
			public String getForumStateValue() {
				return forumStateValue;
			}
			/**
			* 设置： 帖子状态的值
			*/
			public void setForumStateValue(String forumStateValue) {
				this.forumStateValue = forumStateValue;
			}






				//级联表的get和set dianzhang

					/**
					* 获取： 店长姓名
					*/
					public String getDianzhangName() {
						return dianzhangName;
					}
					/**
					* 设置： 店长姓名
					*/
					public void setDianzhangName(String dianzhangName) {
						this.dianzhangName = dianzhangName;
					}

					/**
					* 获取： 头像
					*/
					public String getDianzhangPhoto() {
						return dianzhangPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setDianzhangPhoto(String dianzhangPhoto) {
						this.dianzhangPhoto = dianzhangPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getDianzhangPhone() {
						return dianzhangPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setDianzhangPhone(String dianzhangPhone) {
						this.dianzhangPhone = dianzhangPhone;
					}








				//级联表的get和set jiaolian

					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}

					/**
					* 获取： 头像
					*/
					public String getJiaolianPhoto() {
						return jiaolianPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setJiaolianPhoto(String jiaolianPhoto) {
						this.jiaolianPhoto = jiaolianPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}



































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 现积分
					*/
					public Double getYonghuJifen() {
						return yonghuJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuJifen(Double yonghuJifen) {
						this.yonghuJifen = yonghuJifen;
					}

					/**
					* 获取： 会员类型
					*/
					public Integer getHuanyuanTypes() {
						return huanyuanTypes;
					}
					/**
					* 设置： 会员类型
					*/
					public void setHuanyuanTypes(Integer huanyuanTypes) {
						this.huanyuanTypes = huanyuanTypes;
					}


						/**
						* 获取： 会员类型的值
						*/
						public String getHuanyuanValue() {
							return huanyuanValue;
						}
						/**
						* 设置： 会员类型的值
						*/
						public void setHuanyuanValue(String huanyuanValue) {
							this.huanyuanValue = huanyuanValue;
						}

					/**
					* 获取： 年费会员到期时间
					*/
					public Date getHuiyuandaoqiTime() {
						return huiyuandaoqiTime;
					}
					/**
					* 设置： 年费会员到期时间
					*/
					public void setHuiyuandaoqiTime(Date huiyuandaoqiTime) {
						this.huiyuandaoqiTime = huiyuandaoqiTime;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}








			//级联表的get和set users

					/**
					* 获取： 用户名
					*/
					public String getUusername() {
						return uusername;
					}
					/**
					* 设置： 用户名
					*/
					public void setUusername(String uusername) {
						this.uusername = uusername;
					}

					/**
					* 获取： 密码
					*/
					public String getUpassword() {
						return upassword;
					}
					/**
					* 设置： 密码
					*/
					public void setUpassword(String upassword) {
						this.upassword = upassword;
					}

					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}

					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
