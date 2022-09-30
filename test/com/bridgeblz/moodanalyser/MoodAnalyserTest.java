package com.bridgeblz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@Test
	void givenSadMessage_ShouldReturnSAD() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assertions.assertEquals("SAD", mood);
	}

	@Test
	void givenAnyMessage_ShouldReturnHAPPY() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
		String mood = moodAnalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}

}