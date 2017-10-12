package models;

/**
 *
 * @author allan
 */
public class Trapezio extends FigGeo{
    private double baseMenor, lado1, lado2, altura;

    public Trapezio(double baseMenor, double lado1, double lado2, double altura, double lado) {
        super(lado);
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return ((getLado() + baseMenor) / 2) * altura;
    }

    @Override
    public double calcPerimetro() {
        return getLado() + baseMenor + lado1 + lado2;
    }
    
    
    
}
