package com.kim8o.g.mygymbuddy;


import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
//Add the Listener to the Fragment

public class GymPlanBldrListFragment extends ListFragment {
    static interface GymPlanListListener{
        void itemClicked(long id);
    }
    private GymPlanListListener listener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] machineNames =new String [GymPlan.gymplans.length];
        //Create a string array for the Machines available to the user

        for (int i =0 ;i< machineNames.length;i++){
            machineNames[i]= GymPlan.gymplans[i].getMachineName();
        }
//Create an array adapter
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(
                inflater.getContext(),android.R.layout.simple_list_item_1, machineNames);
        setListAdapter(adapter);


        return super.onCreateView(inflater,container,savedInstanceState);
    }
    //This is called when the fragment gets attached to the activity
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.listener = (GymPlanListListener)activity;
    }
    @Override

    //Tell the listener when an item/machine name in the ListView is clicked
    //GK
    //Please note this is a l "small L" not 1
    public void onListItemClick(ListView l,View v, int position, long id){
        if (listener !=null){
            listener.itemClicked(id);
        }
    }
}
