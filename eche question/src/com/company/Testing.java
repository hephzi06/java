package com.company;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
    }
    public static double getAverageScore( double score1 , double score2, double score3, double score4) {
         double sum = score1 + score2 + score3 + score4 ;
         double avgscore = sum / 4;
         return  avgscore;

    }
}
