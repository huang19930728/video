package com.video.videoservice.user;

import com.video.videodao.pojo.bean.User;
import com.video.videodao.pojo.mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public void insert(User pojo){
         userDao.insert(pojo);
    }

    public int insertList(List<User> pojos){
        return userDao.insertList(pojos);
    }

    @Override
    public List<User> getUserAll() {
        return userDao.getUserAll();
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
