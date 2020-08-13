package com.MoodAnalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void moodAnalyzer_ForHappyMessage_Should_ReturnHappy() {
      MoodAnalyser moodAnalyser = new MoodAnalyser("I am in HAPPY mood");
      String mood = moodAnalyser.analyseMood();
      Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void moodAnalyzer_ForSadMessage_Should_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalyzer_ForAnyMessage_Should_ReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in ANY mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void moodAnalyzer_forNullMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood();
        }catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void moodAnalyzer_forNoMessage_ShouldReturnEMPTYMOOD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            String mood = moodAnalyser.analyseMood();
        }catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY, e.type);
        }
    }
}
