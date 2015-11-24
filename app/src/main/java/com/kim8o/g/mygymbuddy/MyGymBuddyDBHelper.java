package com.kim8o.g.mygymbuddy;

/**
 * Created by gkimetto on 11/17/2015.
 */

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

//SQLite helpers must extend the SQLIteOpenHelper Class


import android.content.ContentValues;

class MyGymBuddyDBHelper extends SQLiteOpenHelper {

    //Database name MyGymBuddy

    public static final String DB_NAME = "mygymbuddydb";

    //Database Version of mygymbuddydb
    private static final int DB_VERSION = 2;

    //The onCreate and onUpgrade methods are mandatory.
    //Leaving empty for now and will update later

    MyGymBuddyDBHelper (Context context) {
        //Calling the constructor of the SQLiteOpenHelper superclass and passing
        //it the database name and version

        //NOTE : "null" parameter below is an advanced feature relating to cursors.TBD.
        super(context, DB_NAME, null,DB_VERSION);

    }
        @Override
        public void onCreate(SQLiteDatabase db){
            updateMyGymBuddyDB(db, 0, DB_VERSION);



    }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            updateMyGymBuddyDB(db, 0, newVersion);
        }

    private void updateMyGymBuddyDB (SQLiteDatabase db, int oldVersion, int newVersion)
    {
        if(oldVersion < 1)
        {
            //Create user Profile table


            db.execSQL("CREATE  TABLE USERPROFILE(_id INTEGER PRIMARY KEY AUTOINCREMENT, USER_NAME TEXT, USER_PASSWORD TEXT,PASSWORD_HINT TEXT");
            insertNewUser(db, "username var", "password var", "hint var");

            //Create GYMPLAN table

            db.execSQL("CREATE  TABLE GYMPLAN(_id INTEGER PRIMARY KEY AUTOINCREMENT, MACHINE_NAME TEXT, EXERCISE_STEPS TEXT,MACHINE_IMAGE_ID INTEGER");
            //Insert data to the table
            insertGymPlan(db, "Stationary Bike"," Step on stationary bike\n Set to desired speed\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cycle);
            insertGymPlan(db, "Abdominal Bench"," Lie on your back \n Secure your feet \n Do full range ab crunches\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.abdominalbench);
            insertGymPlan(db, "Squat Station","S tep on Squat Station\n Start squatting while controlling breathing\nMuscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cycle);
            insertGymPlan(db, "Bench Press"," Choose appropriate weight\n Lie on the bench\n Proceed with bench press\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.abdominalbench);
            insertGymPlan(db, "Lateral Pull Down"," Set appropriate weight\n Repeat reps as required\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.latpulldownmachine);
            insertGymPlan(db, "Leg Extension"," Select weight\n Slowly extend leg as you control breathing\n Repeat\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.legextensionmachine);
            insertGymPlan(db, "Leg Curl Machine"," Select weight\n Do 20 leg curls\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.legabductionadductionmachine);
            insertGymPlan(db, "Smith Machine"," Step on set to desired weight", R.drawable.dumbbells2);
            insertGymPlan(db, "Incline Bench Press"," The incline bench press is another great workout for chest growth.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.inclinebenchpress);
            insertGymPlan(db, "Cables and Pulleys"," Grips are attached to cables.\n A number of exercises can be performed with this\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cablesandpulleys);
            insertGymPlan(db, "Chin Up Bar"," Pull yourself up so your chin is above the bar.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.pullupbar);
            insertGymPlan(db, "Preacher Curls"," A sitted weight lifting exercise that isolates the biceps\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.preachercurl);
            insertGymPlan(db, "Hack Squat Machine"," A combination of the leg press and squat\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.hacksquatmachine);
            insertGymPlan(db, "Kettle Bell"," Tons of ways you can use the kettle bell\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.kettlebells1);
            insertGymPlan(db, "Wall Ball"," Throw the ball against a wall and catch it on the way down.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.wallball);
            insertGymPlan(db, "Foam Roller"," Not exactly an exercise but a good tool for reducing soreness and flexibility", R.drawable.foamroller);
            insertGymPlan(db, "Hyper Extension Bench"," Move your upper body up and down. Weights can be held to increase the difficulty\nLower back, glutes", R.drawable.dumbbells2);
            insertGymPlan(db, "Incline Bench Press"," The incline bench press is another great workout for chest growth.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.inclinebenchpress);
            insertGymPlan(db, "Cables and Pulleys"," Grips are attached to cables.\n A number of exercises can be performed with this\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.cablesandpulleys);
            insertGymPlan(db, "Chin Up Bar"," Pull yourself up so your chin is above the bar.\n" +
                    "Muscles Used:\tLegs, Core, Shoulders, Chest", R.drawable.pullupbar);
            insertGymPlan(db, "Pec Deck Machine", " Step on set to desired speed", R.drawable.barbells);

            ///Create Equipment Table
            //Create DietPlan Table

            db.execSQL("CREATE  TABLE DIETPLAN(_id INTEGER PRIMARY KEY AUTOINCREMENT, DIET_NAME TEXT, RECIPE_STEPS TEXT,DIET_IMAGE_ID INTEGER);");
//Insert date to the table

            insertDietPlan(db, "Atkins Diet"," Cook raw chicken\n Set to desired speed\n ", R.drawable.chicken);
            insertDietPlan(db, "Weight watchers"," Lie on your back \n Secure your feet \n Do full range ab crunches", R.drawable.fruit);
            insertDietPlan(db, "Paleo","Step on Squat Station\n Start squatting while controlling breathing", R.drawable.fruit2);
            insertDietPlan(db, "Gluten Free"," Choose appropriate weight\n Lie on the bench\n Proceed with bench press", R.drawable.sushi);
            insertDietPlan(db, "South Beach Diet", " Set appropriate weight\n Repeat reps as required", R.drawable.chicken);
        }
        if (oldVersion < 2)
        {
            db.execSQL("ALTER TABLE GYMPLAN ADD COLUMN GYM_DATE NUMERIC;");
            db.execSQL("ALTER TABLE GYMPLAN ADD COLUMN CALORIES_BURNT INTEGER;");

            db.execSQL("ALTER TABLE DIETPLAN ADD COLUMN DIET_DATE NUMERIC;");
            db.execSQL("ALTER TABLE DIETPLAN ADD COLUMN DIET_CALORIES INTEGER;");


        }
    }
        private static void insertGymPlan(SQLiteDatabase db, String machineName, String machineSteps, int machineImageId){
            ContentValues gymPlanValues = new ContentValues();
            gymPlanValues.put("MACHINE_NAME", machineName);
            gymPlanValues.put("EXCERCISE_STEPS", machineSteps);
            gymPlanValues.put("MACHINE_IMAGE_ID", machineImageId);
            db.insert("GYMPLAN", null, gymPlanValues);
        }
    private static void insertDietPlan(SQLiteDatabase db, String dietName, String dietRecipeSteps, int dietImageId){
        ContentValues dietPlanValues = new ContentValues();
        dietPlanValues.put("DIET_NAME", dietName);
        dietPlanValues.put("RECIPE_STEPS", dietRecipeSteps);
        dietPlanValues.put("DIET_IMAGE_ID", dietImageId);
        db.insert("DIETPLAN", null,dietPlanValues);
    }

    private static void insertNewUser(SQLiteDatabase db, String userName, String userPassword, String userPasswordHint ){
        ContentValues userProfileValues = new ContentValues();
        userProfileValues.put("USER_NAME", userName);
        userProfileValues.put("USER_PASSWORD", userPassword);
        userProfileValues.put("PASSWORD_HINT", userPasswordHint);
        db.insert("USERPROFILE", null,userProfileValues);
    }

    }



