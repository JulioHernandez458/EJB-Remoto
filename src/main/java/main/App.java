/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.IEjbCuadrado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import domain.IEjbRectangulo;
import domain.IEjbTriangulo;

/**
 *
 * @author Julio Hernández
 */
public class App {
    
    public static void main(String[] args) {
        
        try {
            Context jdni = new InitialContext();
            IEjbRectangulo rectangulo =  (IEjbRectangulo) jdni.lookup("java:global/EjbRemoteMulti/EjbRectanguloImpl");
            IEjbTriangulo triangulo = (IEjbTriangulo) jdni.lookup("java:global/EjbRemoteMulti/EjbTrianguloImpl!domain.IEjbTriangulo");
            IEjbCuadrado cuadrado = (IEjbCuadrado) jdni.lookup("java:global/EjbRemoteMulti/EjbCuadradoImpl!domain.IEjbCuadrado");
            
            double area_rectangulo = rectangulo.area(10, 2);
            double area_triangulo = triangulo.area(5, 6);
            double area_cuadrado = cuadrado.area(4);
            
            System.out.println(" *******  ");
            System.out.println(" *******  ");
            System.out.println(" *******  ");
            System.out.println("area_rectangulo = " + area_rectangulo);
            System.out.println(" *******  ");
            System.out.println("area_triangulo = " + area_triangulo);
            System.out.println(" *******  ");
            System.out.println("area_cuadrado = " + area_cuadrado);
            System.out.println(" *******  ");
            System.out.println(" *******  ");
            System.out.println(" *******  ");
            
        } catch (NamingException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
