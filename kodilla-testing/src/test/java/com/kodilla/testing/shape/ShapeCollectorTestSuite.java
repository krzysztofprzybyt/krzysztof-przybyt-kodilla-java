package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith",
                "Hello everyone, this is my first contribution here!");

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given


        //When

        //Then

    }
    @Test
    public void testGetFigure() {
        //Given

        //When

        //Then

    }
    @Test
    public void ShowFigures() {
        //Given


        //When

        //Then
    }

}
