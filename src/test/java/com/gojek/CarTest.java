package com.gojek;
/*
 * @author Ahmad Emir Alfatah
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest
{
    @Test
    public void testGetRegNumber()
    {
        //declare object car
        Car car = new Car("BG 1010 KK","Red");

        //expected output
        String expected = "BG 1010 KK";

        //test
        assertEquals(expected,car.getRegNumber());
    }

    @Test
    public void testGetColour()
    {
        //declare object car
        Car car = new Car("BG 1010 KK","Red");

        //expected output
        String expected = "Red";

        //test
        assertEquals(expected,car.getColour());
    }
}