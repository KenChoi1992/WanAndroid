package com.example.hy.wanandroid.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.hy.wanandroid.R;
import com.example.hy.wanandroid.network.entity.hierarchy.FirstHierarchy;
import com.example.hy.wanandroid.network.entity.hierarchy.FirstHierarchyChild;
import com.example.hy.wanandroid.utils.CommonUtil;

import java.util.List;
import androidx.annotation.Nullable;

/**
 * 一级体系的adapter
 * Created by 陈健宇 at 2018/10/28
 */
public class FirstHierarchyListAdapter extends BaseQuickAdapter<FirstHierarchy, BaseViewHolder>{

    public FirstHierarchyListAdapter(int layoutResId, @Nullable List<FirstHierarchy> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FirstHierarchy item) {
        String secondLeverText = "";
        if(item != null){
            if(CommonUtil.isEmptyList(item.getChildren()))
                for (FirstHierarchyChild child : item.getChildren()){
                    secondLeverText += child.getName() + "  ";
                }
            helper.setText(R.id.tv_first_lever, item.getName())
                    .setText(R.id.tv_second_lever, secondLeverText);
        }
    }
}