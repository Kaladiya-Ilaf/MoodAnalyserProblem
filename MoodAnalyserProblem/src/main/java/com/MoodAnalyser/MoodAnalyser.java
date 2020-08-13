package com.MoodAnalyser;

public class MoodAnalyser {
    public String analyseMood(String messageMood) {
        if(messageMood.contains("HAPPY")){
            return "HAPPY";
        }else{
            return "SAD";
        }

    }

}
