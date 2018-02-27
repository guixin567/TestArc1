package com.example.aar_ob;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.aar_ob.data.Word;

import java.util.List;

/**
 * @author 归零 on 2018-02-2712:15.
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

    public void insertWord(Word word){
        mWordRepository.insertWord(word);
    }

    public void deleteWord(Word word) {
        mWordRepository.deleteWord(word);
    }
}
