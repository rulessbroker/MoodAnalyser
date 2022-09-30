package com.bridgeblz.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (this.message.contains("sad")) {
			return "SAD";
		} else
			return "HAPPY";
	}
}
