package com.basics;

public class GradeCalculator {

    private void validateScore(int score){
         if(score >=0 && score <= 100){
             throw new IllegalArgumentException("Score must be between 0 and 100. Got: " + score);
         }
    }

    public char gradingScale(int score){
        if(score >=90 && score<=100){
            return 'A';
        } else if (score>=80 && score<=89) {
            return 'B';
        }else if (score>=70 && score<=79) {
            return 'C';
        }else if (score>=60 && score<=69) {
            return 'D';
        }else{
            return 'F';
        }
    }

    public char calculateLetterGrade(int score){
        validateScore(score);
        return gradingScale(score);
    }

    public double calculateGPA(int score){
        validateScore(score);
        if(gradingScale(score) == 'A'){
            return 4.0;
        } else if (gradingScale(score) == 'B') {
            return 3.0;
        }else if (gradingScale(score) == 'C') {
            return 2.0;
        }else if (gradingScale(score) == 'D') {
            return 1.0;
        }else{
            return 0.0;
        }
    }

    public double calculateAvgScores(int[] scores){
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores array cannot be null or empty");
        }
        int total = 0;
        for(int score:scores){
            validateScore(score);
            total += score;
        }
        return (double) total/scores.length;
    }

    public char getLetterGradeAvg(int[] scores){
        double avgScore = calculateAvgScores(scores);
        return gradingScale((int) avgScore);
    }

    public int getHighestScore(int[] scores){
        int max = 0;

        for(int score : scores){
            if(score > max){
                max = score;
            }
        }
        return max;
    }

    public int getLowestScore(int[] scores){
        int min = Integer.MAX_VALUE;

        for(int score :scores){
            if(score < min){
                min = score;
            }
        }
        return min;
    }
}
