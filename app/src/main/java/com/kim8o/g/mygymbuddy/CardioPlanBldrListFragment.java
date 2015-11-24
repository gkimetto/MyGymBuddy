package com.kim8o.g.mygymbuddy;

/**
 * Created by gkimetto on 11/20/2015.
 */
import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;

//Add the Listener to the Fragment

    public class CardioPlanBldrListFragment extends ListFragment {
        static interface CardioPlanListListener {
            void itemClicked(long id);
        }

        private CardioPlanListListener listener;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String[] cardioNames = new String[CardioPlan.cardioplans.length];

            //Create a string array for the Machines available to the user

            for (int i = 0; i < cardioNames.length; i++) {
                cardioNames[i] = CardioPlan.cardioplans[i].getCardioName();
            }

//Create an array adapter
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    inflater.getContext(), android.R.layout.simple_list_item_1,cardioNames);
            setListAdapter(adapter);


            return super.onCreateView(inflater, container, savedInstanceState);
        }

        //This is called when the fragment gets attached to the activity
        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            this.listener = (CardioPlanListListener) activity;
        }

        @Override

        //Tell the listener when an item/machine name in the ListView is clicked
        //GK
        //Please note this is a l "small L" not 1
        public void onListItemClick(ListView l, View v, int position, long id) {
            if (listener != null) {
                listener.itemClicked(id);
            }
        }

    }


