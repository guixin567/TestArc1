package com.example.ldachu.testarc1;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.ldachu.testarc1.adapter.WordAdapter;
import com.example.ldachu.testarc1.data.Word;

import java.util.ArrayList;
import java.util.List;

public class WordActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView      mTvInsert;
    private EditText      mEtWord;
    private RecyclerView  mRvWord;
    private WordAdapter   mWordAdapter;
    private WordViewModel mWordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordViewModel = ViewModelProviders.of(this).get(WordViewModel.class);
        mWordViewModel.getAllWords().observe(this, new Observer<List<Word>>() {
            @Override
            public void onChanged(@Nullable List<Word> words) {
                mWordAdapter.setNewData(words);
            }
        });
        initView();

        initListener();
    }

    private void initListener() {
       mWordAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
           @Override
           public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
               switch (view.getId()){
                   case R.id.tv_word:
                       mWordViewModel.deleteWord((Word)adapter.getData().get(position));
                       Toast.makeText(WordActivity.this, "test", Toast.LENGTH_SHORT).show();
                       break;
                   default:
                       break;
               }
           }
       });
    }

    private void initView() {
        mTvInsert =  findViewById(R.id.tv_insert);
        mEtWord = findViewById(R.id.et_word);
        mRvWord = findViewById(R.id.rv_word);
        mTvInsert.setOnClickListener(this);
        mRvWord.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Word> words = new ArrayList<>();
        mWordAdapter = new WordAdapter(R.layout.item_word,words);
        mRvWord.setAdapter(mWordAdapter);


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_insert:
                insertData();
                break;
        }
    }

    private void insertData() {
        if(!TextUtils.isEmpty(mEtWord.getText().toString())){
            mWordViewModel.insertWord(new Word(mEtWord.getText().toString()));
            mEtWord.setText("");
        }
    }





}
