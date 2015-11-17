package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DailyUpdate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_update);

    }
//Build a custom workout plan

    public void onClickBuildPlan(View view) {

        Intent intent = new Intent(this, Equipment.class);
        Toast.makeText(DailyUpdate.this, "Getting ready to build a Custom Fitness Plan" +
                "...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


    public void onWorkoutAndLog(View view) {

        Intent intent = new Intent(this, MainPlanBuilder.class);
        Toast.makeText(DailyUpdate.this, "Loading your Workout Profile...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    //Record Daily Cardio section
    public void onClickRecordCardio(View view) {

        Intent intent = new Intent(this, MainPlanBuilder.class);
        Toast.makeText(DailyUpdate.this, "Loading your Cardio Profile...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    //Record Diet
    public void onClickRecordDiet(View view) {

        Intent intent = new Intent(this, MainDietBuilder.class);
        Toast.makeText(DailyUpdate.this, "Loading your Diet Profile...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    //Record user's Weight
    public void onClickRecordWeight(View view) {

        Intent intent = new Intent(this, MainPlanBuilder.class);
        Toast.makeText(DailyUpdate.this, "Loading your Weight Profile...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    //Show user's progress graph weight progression
    public void onClickViewProgress(View view) {

        Intent intent = new Intent(this, MainPlanBuilder.class);
        Toast.makeText(DailyUpdate.this, "Loading your progress......", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_daily_update, menu);
        return true;
    }
    //onClickLogout
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/

}
