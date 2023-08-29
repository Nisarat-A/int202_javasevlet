package com.example.demo;

public class calGrade {
    private int score ;

    public calGrade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public String getGrade() {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
