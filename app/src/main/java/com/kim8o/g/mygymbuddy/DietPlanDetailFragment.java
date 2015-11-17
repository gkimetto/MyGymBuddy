package com.kim8o.g.mygymbuddy;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import org.w3c.dom.Text;


/**
 * A placeholder fragment containing a simple view.
 */
public class DietPlanDetailFragment extends Fragment {

    public DietPlanDetailFragment() {
    }

    private long dietPlanId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState!=null){
            //If there is a state to save
            //Set the value of gymPlanId
            dietPlanId=savedInstanceState.getLong("dietPlanId",dietPlanId);
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diet_plan_detail, container, false);
    }
    @Override
    public void onStart()
    {
        super.onStart();
        View view = getView();


        if (view!=null){

            TextView dietPlanName =(TextView) view.findViewById(R.id.txtDietName);
            DietPlan dietplan=DietPlan.dietplans[(int) dietPlanId];
            dietPlanName.setText(dietplan.getDietName());
            TextView dietPlanRecipes = (TextView) view.findViewById(R.id.txtDietRecipeSteps);
            dietPlanRecipes.setText(dietplan.getDietRecipes());
            ImageView dietImages =(ImageView) view.findViewById(R.id.imgDiet);
            dietImages.setImageResource(dietplan.getDietImageId());


        }
    }
    @Override
    //Save the value of the gymPlanID in the savedInstanceState Bundle before the fragment gets destroyed.
    //We will retrieve it in the onCreateView() method

    public void onSaveInstanceState(Bundle savedInstanceState){

        savedInstanceState.putLong("dietPlanId", dietPlanId);
    }
    public void setDietPlan(long id2){

        this.dietPlanId=id2;
    }

}
