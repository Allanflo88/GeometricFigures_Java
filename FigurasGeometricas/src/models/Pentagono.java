package models;

/**
 *
 * @author allan
 */
public class Pentagono extends FigGeo{
    private double apotema;
    public Pentagono(double lado, double apotema) {
        super(lado);
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    @Override
    public double calcArea() {
        return calcPerimetro() * apotema;
    }

    @Override
    public double calcPerimetro() {
        return getLado() * 5;
    }
   
    
    
}
