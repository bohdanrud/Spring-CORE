package model;

import service.Coach;
import service.FortuneService;

public class HockeyCoach implements Coach{

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hockey coach: play hockey 10 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hockey coach: " + fortuneService.getFortune();
	}

}
