package com.MoodAnalyser;

public class MoodAnalyser {
    private String moodState;

    MoodAnalyser(){}

    MoodAnalyser(String moodState){
        this.moodState = moodState;
    }

    public String analyseMood() {
        try {
            if(moodState.length() == 0)
            {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY, "EMPTY MOOD");
            }
            if (moodState.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "HAPPY");
        }

    }

}
