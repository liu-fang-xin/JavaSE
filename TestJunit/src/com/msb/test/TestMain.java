package com.msb.test;

import com.msb.enum01.Season;
import org.junit.Test;

public class TestMain {
    @Test
    public void testAdd(){
        System.out.println("true = " + true);
    }
    @Test
    public void testEnum(){
        Season season1 = Season.AUTUMN;
        System.out.println("season1 = " + season1);
        Season[] seasons = Season.values();
        for (Season season:seasons){
            System.out.println("season = " + season);
        }
    }
}
