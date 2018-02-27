package com.example.ldachu.testarc1.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * @author 归零 on 2018-02-2710:31.
 * 单词表操作接口
 */
@Dao
public interface WordDao {
    @Query("SELECT * FROM word_table")
    LiveData<List<Word>> getAllWords();
    @Insert
    void insertWord(Word word);

    @Delete
    void deleteWord(Word word);
}
