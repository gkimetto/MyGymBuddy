package com.kim8o.g.mygymbuddy;

/**
 * Created by gkimetto on 11/20/2015.
 */
public class CardioPlan {

//Each Cardio has a few Cardio Exercises Steps and calorie counter


    private String cardioName;
    private String cardioDetailInstructons;
    private int cardioImageId;
    private int cardioDuration;
    private int cardioCalorieCount;
    private int cardioCalBurnRate;
    private int cardioDistance;

    //gymplans is an array of CardioPlans

    public static final CardioPlan[] cardioplans = {
            new CardioPlan("Long Distance Run", " Stretch before you run\n Run at a comfortable pace but not too slow\n Pay attention to your breathing and rest if you need to \n", R.drawable.trot,0,200,50,0),
            new CardioPlan("Swimming", " Stretch before you swim\n" +
                    " Swim at a comfortable stroke/pace\n Pay attention to your breathing and rest if you need to \n", R.drawable.swim,0,200,50,0),
            new CardioPlan("Biking", "Step on Squat Station\n Start squatting while controlling breathing", R.drawable.cycle,0,200,50,0),
            new CardioPlan("Rowing", " Choose appropriate weight\n Lie on the bench\n Proceed with bench press", R.drawable.pullupbar,0,200,50,0),
            new CardioPlan("Stationary Bike", " Set appropriate tension\n Repeat reps as required", R.drawable.cycle,0,200,50,0),
            new CardioPlan("Sprints", "run as fast as you can for 5 min\n Rest\n Repeat reps as required", R.drawable.cardio,0,200,50,0)


    };

    //Each DietPlan has a machine name description and machine image
    private CardioPlan(String cardioName, String cardioDetailInstructons, int cardioImageId, int cardioDuration, int cardioCalorieCount, int cardioCalBurnRate, int cardioDistance) {
        this.cardioName=cardioName;
        this.cardioDetailInstructons=cardioDetailInstructons;
        this.cardioImageId=cardioImageId;
        this.cardioDuration=cardioDuration;
        this.cardioCalorieCount=cardioCalorieCount;
        this.cardioCalBurnRate=cardioCalBurnRate;
        this.cardioDistance=cardioDistance;

    }


    //Getters for private variables

    public String getCardioName() {
        return cardioName;
    }

    public String getCardioDetailInstructons() {
        return cardioDetailInstructons;
    }

    public int getCardioImageId() {
        return cardioImageId;
    }
    public int getCardioDuration()
    {
        return cardioDuration;
    }
    public int getCardioCalorieCount()
    {
        return cardioCalorieCount;
    }
    public int getCardioCalBurnRate(){
        return cardioCalBurnRate;
    }
    public int getCardioDistance(){
        return cardioDistance;

    }
    public String toString() {
        return this.cardioName;
    }

}


