package com.example.ldachu.testarc1;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.ldachu.testarc1.data.Word;

import java.util.List;

/**
 * @author 归零 on 2018-02-2710:43.
 */

public class WordViewModel extends AndroidViewModel {

    private final WordRepository mWordRepository;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
    }

    public LiveData<List<Word>> getAllWords(){
        return mWordRepository.getAllWords();
    }

    public void insertWord(final Word word){
        new Thread(){
            @Override
            public void run() {
                super.run();
                mWordRepository.insertWord(word);
            }
        }.start();

    }

    public void deleteWord(final Word word) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                mWordRepository.deleteWord(word);
            }
        }.start();
    }
}
