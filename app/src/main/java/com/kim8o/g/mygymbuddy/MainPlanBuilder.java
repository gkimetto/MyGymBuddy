package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;


public class MainPlanBuilder extends Activity implements GymPlanBldrListFragment.GymPlanListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plan_builder);
        //----Commented out to implement interfaces
        //GymPlanDetailFragment gymPlanFrag = (GymPlanDetailFragment) getFragmentManager().findFragmentById(R.id.gym_plan_detail_frag);
        //gymPlanFrag.setGymPlan(2);
    }
    @Override
    public void itemClicked(long id){
        //This is defined in the listener
        GymPlanDetailFragment details = new GymPlanDetailFragment();
        //Start the fragment transaction
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setGymPlan(id);
        //Reglace the fragment and add it to the back stack
        ft.replace(R.id.frag_cont_main_plan_bldr, details);
        //Add it to the back stack
        ft.addToBackStack(null);
        //Get the new and old fragments to transition in and out
        //See pg 301 for options

        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        //Commit the transaction
        ft.commit();


    }
}
