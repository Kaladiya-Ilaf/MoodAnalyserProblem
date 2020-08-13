package com.MoodAnalyser;

public class MoodAnalyser {
    public String analyseMood(String messageMood) {
        if(messageMood.contains("SAD")){
            return "SAD";
        }else{
            return "HAPPY";
        }

    }

}
