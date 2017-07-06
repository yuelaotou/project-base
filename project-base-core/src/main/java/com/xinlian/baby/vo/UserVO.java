package com.xinlian.baby.vo;

/**
 * Created by dmin on 2017/7/6.
 */
public class UserVO extends PageVO {

    /**
     * 用户ID
     */
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
     * 创建日期 - 起始
     */
    private String createTimeStart;

    /**
     * 创建日期 - 结束
     */
    private String createTimeEnd;


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

    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        if (null != createTimeStart) {
            this.createTimeStart = createTimeStart + " 00:00:00";
        }

    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        if (null != createTimeEnd) {
            this.createTimeEnd = createTimeEnd + " 24:00:00";
        }
    }

}
