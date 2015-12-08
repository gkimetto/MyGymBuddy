package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainDietBuilder extends Activity implements DietPlanListFragment.DietPlanListListener{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_diet_builder);
            //----Commented out to implement interfaces
            //GymPlanDetailFragment gymPlanFrag = (GymPlanDetailFragment) getFragmentManager().findFragmentById(R.id.gym_plan_detail_frag);
            //gymPlanFrag.setGymPlan(2);
        }
        @Override
        public void itemClicked(long id){
            //Get a reference to the frame layout that contains WorkoutDetailFragment
            //This will exist if the app is being run on a device with a large screen
            View fragmentContainer =findViewById(R.id.frag_cont_main_diet_bldr);
            if (fragmentContainer!=null) {
                //This is defined in the listener
                DietPlanDetailFragment details = new DietPlanDetailFragment();
                //Start the fragment transaction
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                details.setDietPlan(id);
                //Reglace the fragment and add it to the back stack
                ft.replace(R.id.frag_cont_main_diet_bldr, details);
                //Add it to the back stack
                ft.addToBackStack(null);
                //Get the new and old fragments to transition in and out
                //See pg 301 for options

                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                //Commit the transaction
                ft.commit();
            }
            else {
                Intent intent = new Intent(this, DetailActivityPhone.class);
                //If the frame layout isn't there the app must be running on a device with a smaller screen
                //Start DetailActivity passing it the ID of the workout
                intent.putExtra(DetailActivityPhone.EXTRA_WORKOUT_ID, (int) id);
                startActivity(intent);
            }

        }
    }
