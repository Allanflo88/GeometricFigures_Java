package models;

/**
 *
 * @author allan
 */
public abstract class FigGeo {
    private double lado;

    public FigGeo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    abstract public double calcArea();
    
    abstract public double calcPerimetro();
}
