package com.example.soume.ipl.HomePageViewActivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.soume.ipl.MainActivity;
import com.example.soume.ipl.R;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by soume on 11-02-2018.
 */

public class HomePageDataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView item;
        private HomePageDataModel homePageDataModelItem;
        private int position;

        public HomePageDataHolder(View view){
            super(view);
            item=(TextView)view.findViewById(R.id.homePageItemName);
        }

    public void setData(HomePageDataModel homepageItem,int position) {
           this.item.setText(homepageItem.getItemName());
            this.homePageDataModelItem=homepageItem;
            this.position=position;
    }

    public void setListner() {
            item.setOnClickListener(HomePageDataHolder.this);
    }

    @Override
    public void onClick(View v) {
        position=this.position;
        System.out.println(position);
        if(position==2){
            Context context=v.getContext();
            Intent intent=new Intent(v.getContext(),MainActivity.class);
            context.startActivity(intent);
        }
    }

}
