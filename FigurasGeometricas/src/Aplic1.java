
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import models.FigGeo;
import models.Circulo;
import models.Losango;
import models.Pentagono;
import models.Quadrado;
import models.Retangulo;
import models.Trapezio;
import models.Triangulo;

/**
 *
 * @author allan
 */
public class Aplic1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FigGeo figura;
        int cont;
        double x, altura, hipo, y, z;
        LinkedList figuras = new LinkedList();
        Iterator i = figuras.iterator();
        
        cont = 0;
        while(true){
            System.out.printf("Digite o lado do quadro %d e tecle enter, para parar digite 0:\n", cont + 1);
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            figura = new Quadrado(x);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite retângulo %d e tecle enter, para parar digite 0:\n", cont + 1);
            System.out.println("Digite lado 1 do retângulo e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite lado 2 do retângulo e tecle enter");
            altura = entrada.nextDouble();
            if(x == 0 || altura == 0){
                break;
            }
            figura = new Retangulo(x, altura);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite o raio do circulo %d e tecle enter, para parar digite 0:\n", cont + 1);
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            figura = new Circulo(x);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite o triangulo %d e tecle enter, para parar digite 0:\n", cont + 1);
            System.out.println("Digite a base do triangulo e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a altura do triangulo e tecle enter");
            altura = entrada.nextDouble();
            System.out.println("Digite a hipotenusa do triangulo e tecle enter");
            hipo = entrada.nextDouble();
            if(x == 0 || altura == 0 || hipo == 0){
                break;
            }
            figura = new Triangulo(x, altura, hipo);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite o pentágono %d e tecle enter, para parar digite 0:\n", cont + 1);
            System.out.println("Digite o lado do pentágono e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a apotema do pentágono e tecle enter");
            altura = entrada.nextDouble();
            if(x == 0 || altura == 0){
                break;
            }
            figura = new Pentagono(x, altura);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite o trapezio %d e tecle enter, para parar digite 0:\n", cont + 1);
            System.out.println("Digite a base menor do trapézio e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a base maior do trapézio e tecle enter");
            z = entrada.nextDouble();
            System.out.println("Digite a altura do trapézio e tecle enter");
            altura = entrada.nextDouble();
            System.out.println("Digite o lado 1 do trapézio e tecle enter");
            hipo = entrada.nextDouble();
            System.out.println("Digite o lado 2 do trapézio e tecle enter");
            y = entrada.nextDouble();
            
            if(x == 0 || altura == 0 || hipo == hipo || y == 0 || z == 0){
                break;
            }
            figura = new Trapezio(x, y, hipo, altura, z);
            figuras.add(figura);
            cont++;
        }
        
        cont = 0;
        while(true){
            System.out.printf("\n\nDigite o losango %d e tecle enter, para parar digite 0:\n", cont + 1);
            System.out.println("Digite a diagonal 1 do losango e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a diagonal 2 do losango e tecle enter");
            y = entrada.nextDouble();
            if(x == 0 || y == 0){
                break;
            }
            figura = new Losango(x, y);
            figuras.add(figura);
            cont++;
        }
        
        
    }
    
}
