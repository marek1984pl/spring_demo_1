/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: Marek
 * Date: 01.02.2018
 * Time: 18:40
 */
package pl.poligro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());

        // setter demo
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        context.close();
    }
}
