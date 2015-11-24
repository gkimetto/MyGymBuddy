
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
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CardioPlanDetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CardioPlanDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardioPlanDetailFragment extends Fragment {


    /**
     * A simple {@link Fragment} subclass.
     */

        private long cardioPlanId;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (savedInstanceState!=null){
                //If there is a state to save
                //Set the value of cardioplanId
                cardioPlanId=savedInstanceState.getLong("cardioPlanId",cardioPlanId);

            }
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_cardio_plan_detail, container, false);
        }
        @Override
        public void onStart()
        {
            super.onStart();
            View view = getView();


            if (view!=null){
                TextView cardioName =(TextView) view.findViewById(R.id.txtCardioName);
                CardioPlan cardioplan =CardioPlan.cardioplans[(int) cardioPlanId];

                cardioName.setText(cardioplan.getCardioName());
                TextView cardioDetailInstructons = (TextView) view.findViewById(R.id.txtCardioSteps);

                cardioDetailInstructons.setText(cardioplan.getCardioDetailInstructons());
                ImageView cardioImageId =(ImageView) view.findViewById(R.id.imgCardio);

                TextView cardioDuration =(TextView) view.findViewById(R.id.txtCardioDuration);
                //CardioPlan cardioplan =CardioPlan.cardioplans[(int) cardioPlanId];

                TextView cardioCalorieCount =(TextView) view.findViewById(R.id.txtCardioCalorieCount);
                //CardioPlan cardioplan =CardioPlan.cardioplans[(int) cardioPlanId];

                TextView cardioCalBurnRate =(TextView) view.findViewById(R.id.txtCardioCalBurnRate);
                //CardioPlan cardioplan =CardioPlan.cardioplans[(int) cardioPlanId];

                TextView cardioDistance =(TextView) view.findViewById(R.id.txtCardioDistance);
                //CardioPlan cardioplan =CardioPlan.cardioplans[(int) cardioPlanId];





            }
        }
        @Override
        //Save the value of the cardioPlanID in the savedInstanceState Bundle before the fragment gets destroyed.
        //We will retrieve it in the onCreateView() method

        public void onSaveInstanceState(Bundle savedInstanceState){
            savedInstanceState.putLong("cardioPlanId", cardioPlanId);

        }
        public void setCardioPlan(long id){
            this.cardioPlanId=id;

        }

    }
