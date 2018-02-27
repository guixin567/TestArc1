package com.example.aar_ob;

import android.app.Application;

import com.example.aar_ob.data.MyObjectBox;

import io.objectbox.BoxStore;

/**
 * @author 归零 on 2018-02-2712:17.
 */

public class App extends Application {

    private BoxStore mBoxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        initObjectBox();
    }

    /**
     * 初始化ObjectBox数据库
     */
    private void initObjectBox() {
        mBoxStore = MyObjectBox.builder().androidContext(getApplicationContext()).build();
    }

    /**
     * 获取BoxStore
     * @return
     */
    public BoxStore getBoxStore(){
        return mBoxStore;
    }
}
