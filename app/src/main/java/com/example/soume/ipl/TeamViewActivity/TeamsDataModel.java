package com.example.soume.ipl.TeamViewActivity;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.soume.ipl.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soume on 10-02-2018.
 */
public class TeamsDataModel {
    private int image;
    private String teamNames;
    public static String[] itemNames = new String[1000];
    public void setImageID(int image){
        this.image=image;
    }
    public void setTeamNames(String name){
        this.teamNames=name;
    }

    public int getImageId(){
        return image;
    }
    public String getTeamName(){
        return teamNames;
    }

    public static List<TeamsDataModel> getTeamList(Context context){
        List<TeamsDataModel> teamList= new ArrayList<>();

        int[] images=getImages();
        String[] names=getNames(context);

        for(int i=0;i<8;i++){
            TeamsDataModel team=new TeamsDataModel();
            team.setImageID(images[i]);
            team.setTeamNames(names[i]);
            teamList.add(team);
        }
        System.out.println(teamList);
        return teamList;
    }
    private static int[] getImages(){
        int[] images={
                R.drawable.kkr, R.drawable.csk,
                R.drawable.rr,R.drawable.mubmai,
                R.drawable.punjab, R.drawable.rcb,
                R.drawable.delhi,R.drawable.srh

        };
        return images;
    }
    private static String[] getNames(Context context){
        String teamNames[]={
                "KKR","CSK",
                "RR","MI",
                "KXIP","RCB",
                "DD","SRH"
        };
        return teamNames;

//        RequestQueue requestQueue= Volley.newRequestQueue(context);
//        String url="http://cricapi.com/api/matchCalendar?apikey=KwyJcYPJ5EZHEjmajEZ2W4funEg1";
//
//        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.POST, url, null, new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                String aJsonString = null;
//                try {
//                    JSONArray arrjson=response.getJSONArray("data");
//
//                    String[] arr = new String[arrjson.length()];
//                    for(int i = 0; i < arrjson.length(); i++) {
//                       JSONObject matchList = arrjson.getJSONObject(i);
//                        itemNames[i]=matchList.getString("name");
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        });
//
//        requestQueue.add(jsonObjectRequest);
//        return itemNames;
//
   }

}