package com.video.videodao.pojo.mapper;

import com.video.videodao.pojo.bean.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UserDao {

    void insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    int update(@Param("pojo") User pojo);

    List<User> getUserAll();
    void  save (User user);

}
