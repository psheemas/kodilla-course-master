package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMockPart1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<10; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

                //Then
        Assert.assertEquals(0,averagePostsPerUser);
        Assert.assertEquals(1,averageCommentsPerUser);
        Assert.assertEquals(-1,averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockPart2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<10; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100,averagePostsPerUser);
        Assert.assertEquals(1,averageCommentsPerUser);
        Assert.assertEquals(0,averageCommentsPerPost);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockPart3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<10; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100,averagePostsPerUser);
        Assert.assertEquals(0,averageCommentsPerUser);
        Assert.assertEquals(0,averageCommentsPerPost);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockPart4(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<10; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100,averagePostsPerUser);
        Assert.assertEquals(10,averageCommentsPerUser);
        Assert.assertEquals(0,averageCommentsPerPost);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockPart5(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<10; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10,averagePostsPerUser);
        Assert.assertEquals(100,averageCommentsPerUser);
        Assert.assertEquals(10,averageCommentsPerPost);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockPart6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(-1,averagePostsPerUser);
        Assert.assertEquals(-1,averageCommentsPerUser);
        Assert.assertEquals(0,averageCommentsPerPost);
    }
    @Test
    public void testCalculateAdvStatisticsWithMockPart7(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock = new ArrayList<String>();
        for ( int n=0; n<100; n++){
            usersMock.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculator calculateStatistics = new StatisticsCalculator();


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePostsPerUser = calculateStatistics.getAveragePostsPerUser();
        int averageCommentsPerUser = calculateStatistics.getAverageCommentsPerUser();
        int averageCommentsPerPost = calculateStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(10,averagePostsPerUser);
        Assert.assertEquals(0,averageCommentsPerUser);
        Assert.assertEquals(0,averageCommentsPerPost);
    }

}
