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
public class Rectangle extends Shape{
    protected double length;
    protected double width;
    
    public Rectangle(){}
    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double length,double width,String color,boolean filled)
    {
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    @Override
    public double getArea()
    {
        return (length*width);
    }
    @Override
    public double getPerimeter()
    {
        return (2*(length+width));
    }
    @Override
    public String toString()
    {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
