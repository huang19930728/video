package com.video.videoservice.user;

import com.video.videodao.pojo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    void insert(User pojo);

    int insertList(@Param("pojos") List< User> pojo);
    List<User> getUserAll();
    int update(@Param("pojo") User pojo);
    void  save (User user);
}
