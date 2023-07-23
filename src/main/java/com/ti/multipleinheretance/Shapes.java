/*package com.ti.multipleinheretance;

import java.util.LinkedList;

//almacenar en una lista privada las figuras que voy creando
public class Shapes {
    private LinkedList<Shape> shapeLinkedList = new LinkedList<>();
    public void addshape(Shape shape){
        shapeLinkedList.add(shape);
    }

    public void list(){
        for (Shape shape:shapeLinkedList){
            System.out.println("Shape name is: "+ shape.shapeName());

            if (shape instanceof Sides){
                Sides s = (Sides)shape;
                System.out.println("Sides numb is: " + s.numSides());
            }
        }
    }
}*/

