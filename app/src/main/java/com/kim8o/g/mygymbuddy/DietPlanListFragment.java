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
 * Created by gkimetto on 11/16/2015.
 */
public class DietPlanListFragment extends ListFragment {


//Add the Listener to the Fragment

    static interface DietPlanListListener{
            void itemClicked(long id);
        }
        private DietPlanListListener listener;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            String[] dietNames =new String [DietPlan.dietplans.length];
            //Create a string array for the Machines available to the user

            for (int j=0;j<dietNames.length;j++)
            {
                dietNames[j]=DietPlan.dietplans[j].getDietName();
            }

//Create and adapter for the array
            ArrayAdapter<String> adapterDiet = new ArrayAdapter<String>(
                    inflater.getContext(),android.R.layout.simple_list_item_1, dietNames);

            setListAdapter(adapterDiet);

            return super.onCreateView(inflater,container,savedInstanceState);
        }
        //This is called when the fragment gets attached to the activity
        @Override
        public void onAttach(Activity activity){
            super.onAttach(activity);
            this.listener = (DietPlanListListener)activity;
        }
        @Override

        //Tell the listener when an item/machine name in the ListView is clicked
        //GK
        //Please note this is a l "small L" not 1
        public void onListItemClick(ListView l,View v, int position, long id2){
            if (listener !=null){
                listener.itemClicked(id2);
            }
        }
    }

