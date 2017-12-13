package com.kodilla.testing.forum.statistics;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalcTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testNoPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<100; i++){
            userList.add("A"+i);
        }

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(18);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getUserCount();
        int postCount = statisticsCalc.getPostCount();
        int commentsCount = statisticsCalc.getCommentsCount();
        double postOnUser = statisticsCalc.getPostOnUser();
        double commentsOnUser = statisticsCalc.getCommentsOnUser();
        double commentsOnPost = statisticsCalc.getCommentsOnPost();
        //Then



    }
    @Test
    public void testPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<100; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getUserCount();
        int postCount = statisticsCalc.getPostCount();
        int commentsCount = statisticsCalc.getCommentsCount();
        double postOnUser = statisticsCalc.getPostOnUser();
        double commentsOnUser = statisticsCalc.getCommentsOnUser();
        double commentsOnPost = statisticsCalc.getCommentsOnPost();
        //Then
        assertEquals(100, usersCount);
        assertEquals(1000, postCount);
        assertEquals(100, commentsCount);
        assertEquals(10.0,postOnUser, 0.0);
        assertEquals(1, commentsOnUser, 0.0);
        assertEquals(0.1, commentsOnPost, 0.0);


    }
}
