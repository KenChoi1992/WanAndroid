package com.example.hy.wanandroid.model.db.bean;

import org.litepal.crud.LitePalSupport;

/**
 * 历史记录表实体类
 * Created by 陈健宇 at 2018/11/2
 */
public class HistoryRecord extends LitePalSupport{

    private String record;
    private int id;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
