package domain;

import javax.ejb.Remote;

/*
 * @author Julio Hernández
 */

@Remote
public interface IEjbCuadrado {
    
    public double area(double n);
    
}
