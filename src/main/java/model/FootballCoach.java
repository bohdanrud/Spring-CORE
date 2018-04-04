package model;

import service.Coach;

public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Football coach: run 30 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Football coach: today is your lucky day!";
	}

}
