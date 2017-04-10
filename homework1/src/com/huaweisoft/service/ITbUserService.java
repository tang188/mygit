package com.huaweisoft.service;

import java.util.List;

import com.huaweisoft.domain.User;

/**
 * 
 * @author tangzh
 *
 */
public interface ITbUserService {
    /**
     * 
     * @param id
     * @return
     */
    String selectByPrimaryKey(int id);
    /**
     * 
     * @param id
     */
     void deleteById(int id);
}
