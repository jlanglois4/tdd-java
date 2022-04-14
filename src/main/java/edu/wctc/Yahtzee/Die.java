package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.List;

public class Die {

    private int dieNum = 0;

    public Die(int dieNum){
        int minValue = 1;
        int maxValue = 6;
        if((dieNum >= minValue) && (dieNum <= maxValue)){
            this.dieNum = dieNum;
        }
    }

    public int getDieNum(){
        return dieNum;
    }

}
