package com.cydeo.solid.openClosed.example1.good;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.ListIterator;

public class DrawShape {

    public void startDrawing(List<Shape> shapes){
        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}
