package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//
//        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        //processor.execute(executeSaySomething);
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a,b) -> (a+b));
//        expressionExecutor.executeExpression(10, 5, (a,b) -> (a-b));
//        expressionExecutor.executeExpression(10, 5, (a,b) -> (a*b));
//        expressionExecutor.executeExpression(10, 5, (a,b) -> (a/b));
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Lorem ipsum", (text) -> (text.toUpperCase()));
        poemBeautifier.beautify("Lorem ipsum", (text) -> (text+"ABC"));
        poemBeautifier.beautify("Lorem ipsum", (text) -> (text.replaceAll("Lorem ipsum","Nowy tekst")));
        poemBeautifier.beautify("Lorem ipsum", (text) -> (text.replace('m', 'k')));
    }
}