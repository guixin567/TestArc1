package com.example.ldachu.testarc1.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * @author 归零 on 2018-02-2710:30.
 * 单词表
 */
@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) {
        mWord = word;
    }

    @NonNull
    public String getWord() {
        return mWord;
    }
}
