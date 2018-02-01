/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: Marek
 * Date: 01.02.2018
 * Time: 18:32
 */
package pl.poligro;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Bat practice";
    }
}
