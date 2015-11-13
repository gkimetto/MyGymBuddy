package com.kim8o.g.mygymbuddy;

/**
 * Created by gkimetto on 11/10/2015.
 */
public class GymPlan {
//Each workout has a gym machine name, instructions and an image id of the machine


    private String machineName;
    private String exerciseSteps;
    private int machineImageId;

    //gymplans is an array of GymPlans

    public static final GymPlan[] gymplans ={
            new GymPlan("Stationary Bike"," Step on stationary bike\n Set to desired speed", R.drawable.cycle),
            new GymPlan("Abdominal Bench"," Lie on your back \n Secure your feet \n Do full range ab crunches", R.drawable.abdominalbench),
            new GymPlan("Squat Station","S tep on Squat Station\n Start squatting while controlling breathing", R.drawable.cycle),
            new GymPlan("Bench Press"," Choose appropriate weight\n Lie on the bench\n Proceed with bench press", R.drawable.abdominalbench),
            new GymPlan("Lateral Pull Down"," Set appropriate weight\n Repeat reps as required", R.drawable.latpulldownmachine),
            new GymPlan("Leg Extension"," Select weight\n Slowly extend leg as you control breathing\n Repeat", R.drawable.legextensionmachine),
            new GymPlan("Leg Curl Machine"," Select weight\n Do 20 leg curls", R.drawable.legabductionadductionmachine),
            new GymPlan("Smith Machine"," Step on set to desired weight", R.drawable.dumbbells2),
            new GymPlan("Pec Deck Machine"," Step on set to desired speed", R.drawable.barbells)


};
    //Each GymPlan has a machine name description and machine image
    private GymPlan(String machineName,String exerciseSteps,int machineImageId){
        this.machineName=machineName;
        this.exerciseSteps=exerciseSteps;
        this.machineImageId=machineImageId;
    }

    //Getters for private variables

    public String getMachineName(){
        return machineName;
    }
    public String getExerciseSteps(){
        return exerciseSteps;
    }
    public int getMachineImageId()
    {
        return machineImageId;
    }

    public String toString(){
        return this.machineName;
    }
}
