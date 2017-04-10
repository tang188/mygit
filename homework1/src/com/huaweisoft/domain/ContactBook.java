package com.huaweisoft.domain;

/**
 * 
 * @author tangzh
 *
 */
public class ContactBook {
    private int id;
    private int userId;
    private int type;
    private String contact;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public ContactBook(int id, int userId, int type, String contact) {
        super();
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.contact = contact;
    }

}
