package models;

/**
 *
 * @author allan
 */
public class Retangulo extends FigGeo{
    private double lado2;

    public Retangulo(double lado2, double lado) {
        super(lado);
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public double calcArea(){
        return getLado() * lado2;
    }
    
    @Override
    public double calcPerimetro(){
        return (getLado() * 2) + (lado2 * 2);
    }
}
