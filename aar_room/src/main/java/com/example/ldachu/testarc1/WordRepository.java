package com.example.ldachu.testarc1;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import com.example.ldachu.testarc1.data.Word;
import com.example.ldachu.testarc1.data.WordDB;
import com.example.ldachu.testarc1.data.WordDao;

import java.util.List;

/**
 * @author 归零 on 2018-02-2710:38.
 * 单词表的数据
 */

public class WordRepository {

    private final WordDao mWordDao;

    public WordRepository(Application application) {
        mWordDao = WordDB.getInstance(application).getWordDao();
    }

    public LiveData<List<Word>> getAllWords(){
        return mWordDao.getAllWords();
    }

    public void insertWord(Word word){
        mWordDao.insertWord(word);
    }

    public void deleteWord(Word word){
        mWordDao.deleteWord(word);
    }
}
