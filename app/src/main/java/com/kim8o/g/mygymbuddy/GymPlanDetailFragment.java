package com.kim8o.g.mygymbuddy;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;



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
    @Override
    public void onStart()
    {
        super.onStart();
        View view = getView();

        System.out.println("View");
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
