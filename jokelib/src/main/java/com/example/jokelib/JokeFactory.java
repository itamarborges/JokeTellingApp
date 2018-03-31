package com.example.jokelib;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JokeFactory {

    static String[] jokes = {"I lost my job at the bank on my very first day. – A woman asked me to check her balance, so I pushed her over.",
                      "Today a man knocked on my door and asked for a small donation towards the local swimming pool. – I gave him a glass of water.",
                      "An old teacher asked her student, “If I say, ‘I am beautiful,’ which tense is that?” The student replied, “It is obviously past.”",
                      "My doctor called me fat. I told him I wanted a second opinion and he said, “OK, you’re ugly too.”",
                      "Why did the picture go to jail? Cause it was framed!"};

    public static String getAJoke() {
        Random rand = new Random();
        int x = rand.nextInt(5);
        return jokes[x];

    }
}
