/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exer5prob2;

/**
 *
 * @author oliverioro_cis21035
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    @Override
    public String toString(){
        if(filled==true){
            return "A Shape with color of "+color+" and filled\n";
        }else{
            return "A Shape with color of "+color+" and Not Filled\n";
        }  
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
