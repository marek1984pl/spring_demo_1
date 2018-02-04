/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: Marek
 * Date: 01.02.2018
 * Time: 20:37
 */
package pl.poligro;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach : no-args constructor");
    }

    private String emailAddress;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach : fortuneService setter");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : setTeam");
        this.team = team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }
}
