package com.huaweisoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.huaweisoft.domain.User;
import com.huaweisoft.service.ITbUserService;
import com.huaweisoft.test.Test;

/**
 * 
 * @author tangzh
 *
 */
public class UserServiceImpl implements ITbUserService {
    List<User> list=Test.initUser();
    @Override
    public String selectByPrimaryKey(int id) {               
        return list.get(id).toString();
    }

    @Override
    public void deleteById(int id) {

        
    }
    
}
