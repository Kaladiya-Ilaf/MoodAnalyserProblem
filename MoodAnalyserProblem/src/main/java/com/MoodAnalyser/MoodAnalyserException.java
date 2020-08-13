package com.MoodAnalyser;

public class MoodAnalyserException extends RuntimeException{
    enum ExceptionType{
        EMPTY, NULL
    }
    ExceptionType type;
    public MoodAnalyserException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
