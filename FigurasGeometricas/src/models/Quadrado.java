package models;

/**
 *
 * @author allan
 */
public class Quadrado extends FigGeo{

    public Quadrado(double lado) {
        super(lado);
    }
    
    @Override
    public double calcArea(){
        return getLado() * getLado();
    }
    
    @Override
    public double calcPerimetro(){
        return getLado() * 4;
    }
}
