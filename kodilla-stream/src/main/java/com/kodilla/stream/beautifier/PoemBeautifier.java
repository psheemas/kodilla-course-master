package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String decoratePoem, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(decoratePoem);
        System.out.println("Result equals: " + result);
    }
}
