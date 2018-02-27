package com.example.ldachu.testarc1.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * @author 归零 on 2018-02-2710:31.
 */
@Database(entities = {Word.class}, version = 1)
public abstract class WordDB extends RoomDatabase{
    public abstract WordDao getWordDao();

    //私有静态化成员变量
    private static volatile WordDB instance;

    //获取对象
    public static WordDB getInstance(Context context) {
        if (instance == null) {
            synchronized (WordDB.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(),WordDB.class,"db_word")
                            .build();
                }
            }
        }
        return instance;
    }
}
