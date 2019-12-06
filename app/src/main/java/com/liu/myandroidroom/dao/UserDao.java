package com.liu.myandroidroom.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.liu.myandroidroom.entity.User;

import java.util.List;

/**
 * @author liuzhenrong
 * @date 2019-12-06 10:01
 * @desc
 */
@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("select * from tb_user")
    List<User> getAll();
}
