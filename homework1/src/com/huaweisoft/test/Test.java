package com.huaweisoft.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.huaweisoft.domain.ContactBook;
import com.huaweisoft.domain.User;
import com.huaweisoft.service.impl.UserServiceImpl;

/**
 * 
 * @author tangzh
 *
 */
public class Test{
    public static void main(String[] args) {
        List<User> users=initUser();
        UserServiceImpl impl=new UserServiceImpl();
        System.out.println(impl.selectByPrimaryKey(0));
        System.out.println(users.get(0));
        
    }
    
    public static List<User> initUser(){
        List<User> userList=new ArrayList<User>();
        Date date=new Date();
        SimpleDateFormat timeFormat=new SimpleDateFormat("yyyy-MM-dd");
        
        User user1=new User(1, "name1", "ÄÐ", timeFormat.format(date), 180);
        User user2=new User(2, "name2", "ÄÐ", timeFormat.format(date), 190);
        userList.add(user1);
        userList.add(user2);
        
        return userList;
    }
    public List<ContactBook> initContactBook(){
       List<ContactBook> listCB=new ArrayList<>();
        ContactBook book1=new ContactBook(0, 1, 1, "contact1");
        ContactBook book2=new ContactBook(0, 2, 2, "contact2");
        listCB.add(book1);
        listCB.add(book2);
        return listCB;
        
    }
}
