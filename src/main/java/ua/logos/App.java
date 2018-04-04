package ua.logos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.FootballCoach;
import model.HockeyCoach;
import model.TennisCoach;
import service.Coach;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //Coach footballCoach = new FootballCoach();   //standart metod
        Coach footballCoach = container.getBean("footballCoach", FootballCoach.class); // using BEAN
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());
        
        Coach tennisCoach = container.getBean("tennisCoach", TennisCoach.class); //depency injection by constructor
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        
        Coach hockeyCoach = container.getBean("hockeyCoach", HockeyCoach.class); //depency injection by setter
        System.out.println(hockeyCoach.getDailyWorkout());
        System.out.println(hockeyCoach.getDailyFortune());
        
        container.close();
    }
}
