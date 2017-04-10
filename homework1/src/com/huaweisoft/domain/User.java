package com.huaweisoft.domain;


/**
 * 
 * @author tangzh
 */
public class User {

    private int id;
    private String name;
    private String sex;
    private String birthday;
    private int height;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public int getDecimal() {
        return height;
    }
    public void setDecimal(int decimal) {
        this.height = decimal;
    }
    public User(int id, String name, String sex, String birthday, int height) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.height = height;
    }
    
    public User() {
        
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", height=" + height + "]"+"\n";
    }
    
}
