/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: Marek
 * Date: 01.02.2018
 * Time: 19:17
 */
package pl.poligro;

public class RunningCoach implements Coach {

    private FortuneService fortuneService;

    public RunningCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Just do it : " + fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Run 3kms";
    }
}
