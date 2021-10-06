package domain;

import javax.ejb.Stateless;

/*
 * @author Julio Hernández
 */
@Stateless
public class EjbCuadradoImpl implements IEjbCuadrado{

    @Override
    public double area(double n) {
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" El Metodo AREA DE CUADRADO Se esta Ejecutando!!! ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        System.out.println(" ***** ");
        return (n*n);
    }
    
}
