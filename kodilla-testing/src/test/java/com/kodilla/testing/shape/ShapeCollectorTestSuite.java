package com.kodilla.testing.shape;


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
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Square(8));
        shapeCollector.addFigure(new Triangle(2,2));
        //Then
        Assert.assertEquals(3, shapeCollector.getShape().size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        Square square = new Square(8);
        Triangle triangle = new Triangle(2,2);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        boolean result1 = shapeCollector.removeFigure(circle);
        boolean result2 = shapeCollector.removeFigure(square);
        boolean result3 = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
        Assert.assertEquals(0, shapeCollector.getShape().size());

    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Square(8));
        shapeCollector.addFigure(new Triangle(2,2));
        //When
        String figure1 = shapeCollector.getFigure(0);
        String figure2 = shapeCollector.getFigure(1);
        String figure3 = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(figure1, "circle o polu: "+Math.PI*Math.pow(4.0,2.0));
        Assert.assertEquals(figure2, "square o polu: "+Math.pow(8.0,2.0));
        Assert.assertEquals(figure3, "triangle o polu: "+2.0);
    }


}
