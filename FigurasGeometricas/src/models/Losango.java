package models;

/**
 *
 * @author allan
 */
public class Losango extends FigGeo{
    private double diag2;

    public Losango(double diag2, double lado) {
        super(lado);
        this.diag2 = diag2;
    }

    public double getDiag2() {
        return diag2;
    }

    public void setDiag2(double diag2) {
        this.diag2 = diag2;
    }

    @Override
    public double calcArea() {
        return (getLado() * diag2) / 2;
    }

    @Override
    public double calcPerimetro() {
        return (getLado() * 2) + (diag2 * 2);
    }
    
    
    
}
