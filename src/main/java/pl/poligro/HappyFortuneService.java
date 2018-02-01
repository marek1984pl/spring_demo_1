/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: Marek
 * Date: 01.02.2018
 * Time: 19:56
 */
package pl.poligro;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
