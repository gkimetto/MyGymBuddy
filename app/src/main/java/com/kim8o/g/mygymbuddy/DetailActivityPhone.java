package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.os.Bundle;


public class DetailActivityPhone extends Activity {
    public static final String EXTRA_WORKOUT_ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activity_phone);
        //Get a reference to the workout
        GymPlanDetailFragment gymPlanDetailFragment = (GymPlanDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        //Get the ID of the workout the user clicked on from the client
        int gymPlanId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        //Pass the workout id to the Fragment
        gymPlanDetailFragment.setGymPlan(gymPlanId);
    }
}
