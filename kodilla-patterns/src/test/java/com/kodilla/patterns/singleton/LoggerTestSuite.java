package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {


    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("example log_1");
        Logger.getInstance().log("example log_2");
        Logger.getInstance().log("example log_3");
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("example log_3", log);
    }

}
