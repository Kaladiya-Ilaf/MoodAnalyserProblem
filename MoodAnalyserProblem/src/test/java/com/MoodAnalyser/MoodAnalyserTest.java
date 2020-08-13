package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testHappyMood() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String mood = moodAnalyser.analyseMood("This is a HAPPY message");
      Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void testSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD message");
        Assert.assertEquals("SAD", mood);
    }
}
