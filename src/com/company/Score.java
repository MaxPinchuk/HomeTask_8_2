package com.company;

public class Score {

    String category;

    double[] statistic = new double[10];

    {
        statistic = new double[10];
        for (int i = 0; i < 10; i++) {
            statistic[i] = i * 1;
        }
    }
}