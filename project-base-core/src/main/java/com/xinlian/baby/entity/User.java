package com.xinlian.baby.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author yangguang
 * @since 2017-07-04
 */
public class User {

	@TableId(value = "id", type = IdType.AUTO)
	private Long id;
	/**
	 * 用户名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 电话号码
	 */
	private String phone;
	/**
	 * 创建日期
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 创建人
	 */
	@TableField("create_pin")
	private String createPin;
	/**
	 * 删除标识
	 */
	@TableLogic
	private Integer yn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatePin() {
		return createPin;
	}

	public void setCreatePin(String createPin) {
		this.createPin = createPin;
	}

	public Integer getYn() {
		return yn;
	}

	public void setYn(Integer yn) {
		this.yn = yn;
	}

	public User() {
		super();
	}

	public User(String name, Integer age, String phone, Date createTime, String createPin, Integer yn) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.createTime = createTime;
		this.createPin = createPin;
		this.yn = yn;
	}

	public User(Long id, String name, Integer age, String phone, Date createTime, String createPin, Integer yn) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.createTime = createTime;
		this.createPin = createPin;
		this.yn = yn;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", createTime="
				+ createTime + ", createPin=" + createPin + ", yn=" + yn + "}";
	}
}
