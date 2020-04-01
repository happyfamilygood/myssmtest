package com.hansem.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hansem.dao.IUserDao;
import com.hansem.model.User;
import com.hansem.service.IUserService;
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
