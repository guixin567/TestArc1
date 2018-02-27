package com.example.aar_ob.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.aar_ob.R;
import com.example.aar_ob.data.Word;

import java.util.List;

/**
 * @author 归零 on 2018-02-2712:15.
 * 单词列表的适配器
 */

public  class WordAdapter extends BaseQuickAdapter<Word,BaseViewHolder> {
    public WordAdapter(int layoutResId, @Nullable List<Word> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Word item) {
        helper.setText(R.id.tv_word,item.text);
        helper.addOnClickListener(R.id.tv_word);

    }
}
