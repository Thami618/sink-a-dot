package com.company;

public class SimpleDotTester {

    public static void main(String[] args) {
        // Instantiate a SimpleDot object
        SimpleDot dot = new SimpleDot();

        //An int array for the location of the Dotcom(3 consecutive ints ot of possible 7)
        int[] locations = {2,3,4};
        // invoke the setter method
        dot.setLocationCells(locations);

        //make a fake guess
        String userGuess = "2";
        //Invoke the CheckYourself() method on the Dot Com object and pass it the fake guess
        String result = dot.CheckYourself(userGuess);
        String testResult = "failed";

        if(result.equals("hit")){
            //if the fake guess(2) gives back a "HIT", it working
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
