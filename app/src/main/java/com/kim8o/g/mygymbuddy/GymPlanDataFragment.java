package com.kim8o.g.mygymbuddy;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class GymPlanDataFragment extends Fragment implements View.OnClickListener {

        //Number of seconds displayed on the stopwatch.
        private int seconds = 0;
        //Is the stopwatch running?
        private boolean running;
        private boolean wasRunning;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (savedInstanceState != null) {
                seconds = savedInstanceState.getInt("seconds");
                running = savedInstanceState.getBoolean("running");
                wasRunning = savedInstanceState.getBoolean("wasRunning");
                if (wasRunning) {
                    running = true;
                }
            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View layout = inflater.inflate(R.layout.fragment_gym_plan_data, container, false);
            runTimer(layout);
            Button startButton = (Button) layout.findViewById(R.id.btn_start);
            startButton.setOnClickListener(this);
            Button stopButton = (Button) layout.findViewById(R.id.btn_stop);
            stopButton.setOnClickListener(this);
            Button resetButton = (Button) layout.findViewById(R.id.btn_save_workout);
            resetButton.setOnClickListener(this);
            Button addWeightsButton= (Button) layout.findViewById(R.id.btn_weight_count_add);
            addWeightsButton.setOnClickListener(this);
            return layout;
        }

        @Override
        public void onPause() {
            super.onPause();
            wasRunning = running;
            running = false;
        }

        @Override
        public void onResume() {
            super.onResume();
            if (wasRunning) {
                running = true;
            }
        }

        @Override
        public void onSaveInstanceState(Bundle savedInstanceState) {
            savedInstanceState.putInt("seconds", seconds);
            savedInstanceState.putBoolean("running", running);
            savedInstanceState.putBoolean("wasRunning", wasRunning);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_start:
                    onClickStart(v);
                    break;
                case R.id.btn_stop:
                    onClickStop(v);
                    break;
                case R.id.btn_save_workout:
                    onClickSaveWorkout(v);
                    break;
            }
        }

        public void onClickStart(View view) {
            running = true;
        }

        public void onClickStop(View view) {
            running = false;
        }

        public void onClickAddCount(View view){
            int intWeightCount=0;
            running = false;
            intWeightCount=(R.id.txt_count +1);

        }

        public void onClickSaveWorkout(View view) {
            running = false;

            //Save to the SQLite database

        }

        private void runTimer(View view) {
            final TextView timeView = (TextView) view.findViewById(R.id.txt_gym_timer);
            final Handler handler = new Handler();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    int hours = seconds / 3600;
                    int minutes = (seconds % 3600) / 60;
                    int secs = seconds % 60;

                    String time = String.format("%1d:%02d:%02d",
                            hours,minutes, secs);
                    timeView.setText(time);
                    if (running) {
                        seconds++;
                    }
                    handler.postDelayed(this, 1000);
                }
            });

        }

    }
