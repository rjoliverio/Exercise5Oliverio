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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle R=new Rectangle(15,12,"blue",true);
        System.out.print(R);
        System.out.printf("\nPerimeter=%.2f\nArea=%.2f\n\n",R.getPerimeter(),R.getArea());
        
        Circle C=new Circle(15,"red",true);
        System.out.println(C);
        System.out.printf("\nPerimeter=%.2f\nArea=%.2f\n\n",C.getPerimeter(),C.getArea());
        
        Square S=new Square(15,"Black",true);
        System.out.println(S);
        System.out.printf("\nPerimeter=%.2f\nArea=%.2f\n\n",S.getPerimeter(),S.getArea());
        
        Shape shape=new Square(15,"Black",true);
        System.out.println(shape);
    }
    
}
