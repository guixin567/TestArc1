package com.example.aar_ob.data;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * @author 归零 on 2018-02-2712:09.
 * ObjectBox的表
 */
@Entity
public class Word {
    @Id
    public long id;

    public String text;
}
