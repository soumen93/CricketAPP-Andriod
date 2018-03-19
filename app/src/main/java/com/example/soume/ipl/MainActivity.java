package com.example.soume.ipl;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.DefaultItemAnimator;

import com.example.soume.ipl.TeamViewActivity.TeamListAdapter;
import com.example.soume.ipl.TeamViewActivity.TeamsDataModel;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Linking the adapter with the recycler View**/
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.teamRecyclerView);
        TeamListAdapter teamViewAdapter=new TeamListAdapter(this ,TeamsDataModel.getTeamList(this));
        recyclerView.setAdapter(teamViewAdapter);

        //link the types of layout manager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //set the animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
