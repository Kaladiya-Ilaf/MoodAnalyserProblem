package com.MoodAnalyser;

public class MoodAnalyser {
    private String moodState;

    MoodAnalyser(){}

    MoodAnalyser(String moodState){
        this.moodState = moodState;
    }

    public String analyseMood() {
        try {
            if (moodState.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }

    }

}
