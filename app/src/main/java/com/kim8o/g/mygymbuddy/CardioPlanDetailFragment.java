
package com.kim8o.g.mygymbuddy;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


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

//public class CardioPlanDetailFragment extends FragmentActivity implements OnMapReadyCallback{
    /**
     * A simple {@link Fragment} subclass.
     */

        private long cardioPlanId;
    private GoogleMap googleMap;
    // latitude and longitude
    double latitude =42.3369558 ;
    double longitude = -71.16921000000002;
    static final LatLng StartCardioPoint = new LatLng(42.349970 , -71.107953);

    //GoogleMap mMap  = MapFragment getFragmentManager().findFragmentById(R.id.).getMap();
     //       GoogleMap mMap=getMap();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //return R.layout.fragment_cardio_plan_detail;
        // create marker
        try {
            // Loading map
            initializeMap();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
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
    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initializeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            googleMap.getUiSettings().setZoomControlsEnabled(true);
            ////////

            googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
                @Override
                public void onMapLoaded() {

//Add markers here
                   // googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 15));

                }
            });

            ///////

            // check if map is created successfully or not
            if (googleMap == null) {
              //  Toast.makeText(CardioPlanDetailFragment.this, "Sorry! unable to create maps", Toast.LENGTH_SHORT).show();
            }
            else{
               // create marker
                MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Hello Maps ");

// adding marker
                googleMap.addMarker(marker);
                // latitude and longitude
                double latitude = 17.385044;
                double longitude = 78.486671;

// create marker
                MarkerOptions marker2 = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Hello Maps");
                googleMap.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(17.385044, 78.486671)).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

// Changing marker icon
                //marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.my_marker_icon)));

// adding marker
                googleMap.addMarker(marker);
            }
        }
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
