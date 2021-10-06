package domain;

import javax.ejb.Remote;

/*
 * @author Julio Hernández
*/

@Remote
public interface IEjbRectangulo {
    
    public double area(double n1, double n2);
}
