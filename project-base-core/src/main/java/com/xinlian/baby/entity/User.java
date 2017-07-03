package com.xinlian.baby.entity;

import java.util.Date;

/**
 * 用户表
 */
public class User {

	public User() {
		super();
	}

	public User(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public User(String name, Integer age, String phone, Date createTime, String createPin) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.createTime = createTime;
		this.createPin = createPin;
	}

	public User(Long id, String name, Integer age, String phone, Date createTime, String createPin, int yn) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.createTime = createTime;
		this.createPin = createPin;
		this.yn = yn;
	}

	/**
	 * 主键ID
	 */
	private Long id;
	/**
	 * 名称
	 */
	private String name;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 电话号码
	 */
	private String phone;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 创建人
	 */
	private String createPin;
	/**
	 * 删除标识
	 */
	private int yn;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public int getYn() {
		return yn;
	}

	public void setYn(int yn) {
		this.yn = yn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", createTime=" + createTime
				+ ", createPin=" + createPin + ", yn=" + yn + "]";
	}

}
