/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;


/**
 *
 * @author oliverioro_cis21035
 */
public class Square extends Rectangle{
    
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
       super(side,side,color,filled);
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return getLength();
    }
    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }
    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }
    @Override
    public double getPerimeter()
    {
        return 4*getLength();
    }
    @Override
    public double getArea()
    {
        return Math.pow(getLength(), 2);
    }
    @Override
    public String toString()
    {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
    
}
