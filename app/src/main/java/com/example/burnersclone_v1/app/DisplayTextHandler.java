package com.example.burnersclone_v1.app;


/**
 * Created by Donny on 5/30/14.
 */
import java.util.Random;


public class DisplayTextHandler {

    private final Random rand;

    public DisplayTextHandler() {

        rand = new Random();

    }

    public String getDisplayText() {

        int randomInt = rand.nextInt(1000);

        String randomString = String.valueOf(randomInt);

        return randomString;

    }


}

