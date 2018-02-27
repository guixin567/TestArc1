package com.example.ldachu.testarc1.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.ldachu.testarc1.R;
import com.example.ldachu.testarc1.data.Word;

import java.util.List;

/**
 * @author 归零 on 2018-02-2710:45.
 */

public  class WordAdapter extends BaseQuickAdapter<Word,BaseViewHolder>{
    public WordAdapter(int layoutResId, @Nullable List<Word> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Word item) {
        helper.setText(R.id.tv_word,item.getWord());
        helper.addOnClickListener(R.id.tv_word);

    }
}
