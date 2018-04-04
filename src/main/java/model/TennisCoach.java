package model;

import service.Coach;
import service.FortuneService;

public class TennisCoach implements Coach{

	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis coach: play tennis 40 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Tennis coach: " + fortuneService.getFortune();
	}

}
