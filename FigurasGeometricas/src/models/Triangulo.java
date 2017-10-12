package models;

/**
 *
 * @author allan
 */
public class Triangulo extends FigGeo{
    private double lado2, hipo;

    public Triangulo(double lado, double lado2, double hipo) {
        super(lado);
        this.lado2 = lado2;
        this.hipo = hipo;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getHipo() {
        return hipo;
    }

    public void setHipo(double hipo) {
        this.hipo = hipo;
    }
    
    @Override
    public double calcArea() {
        double altura = Math.pow(hipo, 2) - Math.pow(getLado(), 2);
        
        return (getLado() * altura) / 2;
        
    }

    @Override
    public double calcPerimetro() {
        return (getLado() + lado2 + hipo);
    }
    
}
