package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        if (number % 3 == 0 && number % 7 == 0) {
            return words[0] + words[1];
        } else if (number % 3 == 0) {
            return words[0];
        } else if (number % 7 == 0) {
            return words[1];
        }
        return "";
    }
}
