package com.example.soume.ipl.TeamViewActivity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import com.example.soume.ipl.R;

import java.util.List;


/**
 * Created by soume on 10-02-2018.
 */

public class TeamListAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private LayoutInflater inflater;
    private List<TeamsDataModel> teamList;

    public TeamListAdapter(Context context,List<TeamsDataModel> teamList){
        inflater= LayoutInflater.from(context);
        this.teamList=teamList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.teams_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;

    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TeamsDataModel team = teamList.get(position);
        holder.setData(team, position);
    }
}
