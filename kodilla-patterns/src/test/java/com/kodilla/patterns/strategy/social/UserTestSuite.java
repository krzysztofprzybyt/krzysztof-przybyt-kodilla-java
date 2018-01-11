package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John");
        User chris = new YGeneration("Chris");
        User angela = new ZGeneration("Angela");
        //When
        String johnShared = john.sharePost();
        String chrisShared = chris.sharePost();
        String angelaShared = angela.sharePost();
        System.out.println("John shared "+johnShared);
        System.out.println("Chris shared "+chrisShared);
        System.out.println("Angela shared "+angelaShared);
        //Then
        Assert.assertEquals("Facebook", johnShared);
        Assert.assertEquals("Twitter", chrisShared);
        Assert.assertEquals("Snapchat", angelaShared);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User angela = new ZGeneration("Angela");
        //When
        String angelaShared = angela.sharePost();
        System.out.println("Angela shared "+angelaShared);
        angela.setSharing(new FacebookPublisher());
        angelaShared = angela.sharePost();
        System.out.println("Angela shared "+angelaShared);
        //Then
        Assert.assertEquals("Facebook", angelaShared);


    }
}
