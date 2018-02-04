/**
 * Copyright 2005 I.D.I. Technologies Ltd.
 * User: marek
 * Date: 04.02.2018
 * Time: 10:52
 */
package pl.poligro;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String [] fortunesList = {"1st fortune", "2nd fortune", "3rd fortune"};

    private Random random = new Random();

    @Override
    public String getFortune() {
        int fortuneNr = random.nextInt(fortunesList.length);
        return fortunesList[fortuneNr];
    }
}
