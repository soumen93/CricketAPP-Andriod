package com.example.soume.ipl.HomePageViewActivity;

import android.app.VoiceInteractor;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soume on 10-02-2018.
 */

public class HomePageDataModel {
    private String itemName;

    public void setItemName(String name){
        this.itemName=name;
    }

    public String getItemName(){
        return itemName;
    }

    public static List<HomePageDataModel> getHomePageTilesObject(Context context){
        List<HomePageDataModel> itemList= new ArrayList<>();
        String[] itemNames=getHomePageItemNames(context);

        for(int i=0;i<4;i++){
            HomePageDataModel homePageDataModel=new HomePageDataModel();
            homePageDataModel.setItemName(itemNames[i]);
            itemList.add(homePageDataModel);
        }
        return itemList;
    }

    public static String[] getHomePageItemNames(Context context){

        String items[]={
                "UPCOMING MATCH",
                "FIXTURE",
                "TEAMS",
                "AUCTION INSIGHTS"
        };
        return items;
    }
}
