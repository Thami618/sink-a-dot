package com.company;

public class SimpleDot {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String CheckYourself(String stringGuess){
        //convert the String to an int
        int guess = Integer.parseInt(stringGuess);
        //Make a variable to hold the result we will return.
        //Put "MISS" in as the default (we assume a miss).
        String result = "miss";

        //Repeat with each cell in the LocationCells array
        for(int cell : locationCells){
            //Compare the user guess to this element(cell) in the array
            if(guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end for
        }//end if
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;

    }

}
