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
            new GymPlan("Stationary Bike"," Step on stationary bike\n Set to desired speed\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cycle),
            new GymPlan("Abdominal Bench"," Lie on your back \n Secure your feet \n Do full range ab crunches\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.abdominalbench),
            new GymPlan("Squat Station","S tep on Squat Station\n Start squatting while controlling breathing\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cycle),
            new GymPlan("Bench Press"," Choose appropriate weight\n Lie on the bench\n Proceed with bench press\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.abdominalbench),
            new GymPlan("Lateral Pull Down"," Set appropriate weight\n Repeat reps as required\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.latpulldownmachine),
            new GymPlan("Leg Extension"," Select weight\n Slowly extend leg as you control breathing\n Repeat\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.legextensionmachine),
            new GymPlan("Leg Curl Machine"," Select weight\n Do 20 leg curls\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.legabductionadductionmachine),
            new GymPlan("Smith Machine"," Step on set to desired weight", R.drawable.dumbbells2),
            new GymPlan("Incline Bench Press"," The incline bench press is another great workout for chest growth.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.inclinebenchpress),
            new GymPlan("Cables and Pulleys"," Grips are attached to cables.\n A number of exercises can be performed with this\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cablesandpulleys),
            new GymPlan("Chin Up Bar"," Pull yourself up so your chin is above the bar.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.pullupbar),
            new GymPlan("Preacher Curls"," A sitted weight lifting exercise that isolates the biceps\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.preachercurl),
            new GymPlan("Hack Squat Machine"," A combination of the leg press and squat\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.hacksquatmachine),
            new GymPlan("Kettle Bell"," Tons of ways you can use the kettle bell\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.kettlebells1),
            new GymPlan("Wall Ball"," Throw the ball against a wall and catch it on the way down.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.wallball),
            new GymPlan("Foam Roller"," Not exactly an exercise but a good tool for reducing soreness and flexibility", R.drawable.foamroller),
            new GymPlan("Hyper Extension Bench"," Move your upper body up and down. Weights can be held to increase the difficulty\nLower back, glutes", R.drawable.dumbbells2),
            new GymPlan("Incline Bench Press"," The incline bench press is another great workout for chest growth.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.inclinebenchpress),
            new GymPlan("Cables and Pulleys"," Grips are attached to cables.\n A number of exercises can be performed with this\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cablesandpulleys),
            new GymPlan("Chin Up Bar"," Pull yourself up so your chin is above the bar.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.pullupbar),
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
