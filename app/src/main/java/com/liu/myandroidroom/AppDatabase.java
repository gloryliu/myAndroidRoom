package com.liu.myandroidroom;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.liu.myandroidroom.dao.UserDao;
import com.liu.myandroidroom.entity.User;

/**
 * @author liuzhenrong
 * @date 2019-12-06 10:06
 * @desc
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
