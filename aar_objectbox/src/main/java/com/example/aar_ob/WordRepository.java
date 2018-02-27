package com.example.aar_ob;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import com.example.aar_ob.data.Word;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.android.ObjectBoxLiveData;

/**
 * @author 归零 on 2018-02-2712:14.
 * 单词数据源
 */

public class WordRepository {

    private final Box<Word> mWordBox;

    public WordRepository(Application application) {
        mWordBox = ((App) application).getBoxStore().boxFor(Word.class);
    }

    public LiveData<List<Word>> getAllWords(){
        return new ObjectBoxLiveData<>(mWordBox.query().build());
    }

    public void insertWord(Word word){
        mWordBox.put(word);
    }

    public void deleteWord(Word word) {
        mWordBox.remove(word);
    }
}
