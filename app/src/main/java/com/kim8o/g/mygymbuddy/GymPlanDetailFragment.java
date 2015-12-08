package com.kim8o.g.mygymbuddy;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class GymPlanDetailFragment extends Fragment {
    private long gymPlanId;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState!=null){
            //If there is a state to save
            //Set the value of gymPlanId
            gymPlanId=savedInstanceState.getLong("gymPlanId",gymPlanId);

        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gym_plan_detail, container, false);
    }


   /* public View onClickStartWorkout (View view){

        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        GymPlanDataFragment gyPlanDataFragment = new GymPlanDataFragment();
        ft.replace(R.id.gym_data_container, gyPlanDataFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

        //Toast.makeText(GymPlanDetailFragment.this, "Loading your Weight Profile...", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_gym_plan_detail, container, false);
    }*/
    @Override
    public void onStart()
    {
        super.onStart();
        View view = getView();


        if (view!=null){
            TextView gymMachineName =(TextView) view.findViewById(R.id.txtMachineName);
            GymPlan gymplan =GymPlan.gymplans[(int) gymPlanId];
            gymMachineName.setText(gymplan.getMachineName());
            TextView machineUseSteps = (TextView) view.findViewById(R.id.txtExcerciseSteps);
            machineUseSteps.setText(gymplan.getExerciseSteps());

            ImageView machineImages =(ImageView) view.findViewById(R.id.imgGymMachine);
            machineImages.setImageResource(gymplan.getMachineImageId());


        }
    }
    @Override
    //Save the value of the gymPlanID in the savedInstanceState Bundle before the fragment gets destroyed.
    //We will retrieve it in the onCreateView() method



    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("gymPlanId", gymPlanId);

    }
    public void setGymPlan(long id){
        this.gymPlanId=id;

}

}
