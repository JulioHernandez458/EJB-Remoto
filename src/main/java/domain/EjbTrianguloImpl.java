package domain;

import javax.ejb.Stateless;

/*
 * @author Julio Hernández
 */

@Stateless
public class EjbTrianguloImpl implements IEjbTriangulo{

    @Override
    public double area(double n1, double n2) {
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" El Metodo AREA DE TRIANGULO Se esta Ejecutando!!! ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        return (n1*n2)/2;
    }
    
}
