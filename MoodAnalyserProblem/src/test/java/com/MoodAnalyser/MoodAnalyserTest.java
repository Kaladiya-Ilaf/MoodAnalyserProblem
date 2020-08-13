package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void moodAnalyzer_ForMessage_Should_ReturnHappy() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String mood = moodAnalyser.analyseMood("I am in HAPPY mood");
      Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void moodAnalyzer_ForMessage_Should_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in SAD mood");
        Assert.assertEquals("SAD", mood);
    }
}
