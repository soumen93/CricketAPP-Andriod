package com.example.soume.ipl.TeamViewActivity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soume.ipl.R;

/**
 * Created by soume on 10-02-2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView teamName;
    private ImageView teamLogo;
    private TeamsDataModel currentTeam;
    private int position;

    public MyViewHolder(View itemView) {
        super(itemView);
        teamName=(TextView)itemView.findViewById(R.id.teamName);
        teamLogo=(ImageView) itemView.findViewById(R.id.teamLogo);
    }

    public void setData(TeamsDataModel team,int position) {
        this.teamName.setText(team.getTeamName());
        this.teamLogo.setImageResource(team.getImageId());
        this.currentTeam=team;
        this.position=position;

    }
}
