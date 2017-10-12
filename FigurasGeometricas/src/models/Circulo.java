package models;

/**
 *
 * @author allan
 */
public class Circulo extends FigGeo{

    public Circulo(double lado) {
        super(lado);
    }
   
    @Override
    public double calcArea(){
        return Math.PI * Math.pow(getLado(), 2);
    }

    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * getLado();
    }
    
}
