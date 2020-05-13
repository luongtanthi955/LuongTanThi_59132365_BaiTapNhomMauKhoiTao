/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class ShapeFactory{
    
    public ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        return instance;
    }

    public static void setInstance(ShapeFactory instance) {
        ShapeFactory.instance = instance;
    }

    public static ShapeFactory instance;
    
    public static ShapeFactory createInstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case circle : return new Circle();
            case rectangle : return new Rectangle();
            case triangle : return new Triangle();
        }
        return null;
    }
}
