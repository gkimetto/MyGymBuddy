package com.kim8o.g.mygymbuddy;

/**
 * Created by gkimetto on 11/13/2015.
 */
public class DietPlan {


//Each Dietplan has a few recipes, instructions and an image id of the meal


    private String dietName;
    private String dietRecipes;
    private int dietImageId;

    //gymplans is an array of DietPlans

    public static final DietPlan[] dietplans ={
            new DietPlan("Atkins Diet"," Cook raw chicken\n Set to desired speed", R.drawable.chicken),
            new DietPlan("Weight watchers"," Lie on your back \n Secure your feet \n Do full range ab crunches", R.drawable.fruit),
            new DietPlan("Paleo","Step on Squat Station\n Start squatting while controlling breathing", R.drawable.fruit2),
            new DietPlan("Gluten Free"," Choose appropriate weight\n Lie on the bench\n Proceed with bench press", R.drawable.sushi),
            new DietPlan("South Beach Diet"," Set appropriate weight\n Repeat reps as required", R.drawable.chicken)


    };
    //Each DietPlan has a machine name description and machine image
    private DietPlan(String dietName,String dietRecipes,int dietImageId){
        this.dietName=dietName;
        this.dietRecipes=dietRecipes;
        this.dietImageId=dietImageId;
    }

    //Getters for private variables

    public String getDietName(){
        return dietName;
    }
    public String getDietRecipes(){
        return dietRecipes;
    }
    public int getDietImageId()
    {
        return dietImageId;
    }

    public String toString(){
        return this.dietName;
    }
}

