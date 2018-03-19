package com.example.soume.ipl.HomePageViewActivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;

import android.view.View;

import com.example.soume.ipl.R;

import java.util.List;

/**
 * Created by soume on 11-02-2018.
 */

public class HomePageAdapter extends RecyclerView.Adapter<HomePageDataHolder> {
    private LayoutInflater inflater;
    public List<HomePageDataModel> homePageDataList;

    public HomePageAdapter(Context context,List<HomePageDataModel> homePageDataList){
            inflater= LayoutInflater.from(context);
            this.homePageDataList=homePageDataList;
    }

    @Override
    public HomePageDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.home_page_layout,parent,false);
        HomePageDataHolder homePageDataHolder=new HomePageDataHolder(view);
        return homePageDataHolder;
    }

    @Override
    public void onBindViewHolder(HomePageDataHolder homePageDataHolder, int position) {
        HomePageDataModel homepageItem=homePageDataList.get(position);
        homePageDataHolder.setData(homepageItem,position);
        homePageDataHolder.setListner();
    }

    @Override
    public int getItemCount() {
        return homePageDataList.size();
    }
}

