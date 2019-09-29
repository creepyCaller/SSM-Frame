package cn.edu.cuit.fpc.service.impl;

import java.util.List;

import cn.edu.cuit.fpc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cuit.fpc.service.UserService;
import cn.edu.cuit.fpc.model.T_User;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(String userName, String password) {
        return userMapper.findUserByNameAndPwd(userName, password);
    }

    @Override
    public void registerUser(T_User user) {
        userMapper.registerUser(user);
    }

    @Override
    public int findUserByEmail(String Email) {
        return userMapper.findUserByEmail(Email);
    }

    @Override
    public void changePasswordByUsername(String password, String userName) {
        userMapper.changePasswordByUsername(password, userName);
    }

    @Override
    public int findUser(String userName) {
        return userMapper.findUserByName(userName);
    }

    @Override
    public void changePasswordByEmail(String password, String email) {
        userMapper.changePasswordByEmail(password, email);
    }

    @Override
    public List<T_User> findAll() {
        return userMapper.findAll();
    }
}
