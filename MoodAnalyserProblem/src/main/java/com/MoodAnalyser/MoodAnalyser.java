package com.MoodAnalyser;

public class MoodAnalyser {
    String moodState;

    MoodAnalyser(){}

    MoodAnalyser(String moodState){
        this.moodState = moodState;
    }

    public String analyseMood() {
        if(moodState.contains("SAD")){
            return "SAD";
        }else{
            return "HAPPY";
        }

    }

}
