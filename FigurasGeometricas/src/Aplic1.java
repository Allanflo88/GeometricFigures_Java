
import java.util.Scanner;
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
        Quadrado quadrados[] = new Quadrado[10];
        Retangulo retangulos[] = new Retangulo[10];
        Circulo circulos[] = new Circulo[10];
        Triangulo triangulos[] = new Triangulo[10];
        Pentagono pentagonos[] = new Pentagono[10];
        Trapezio trapezios[] = new Trapezio[10];
        Losango losangos[] = new Losango[10];
        int contQuad = 0, contRet = 0, contCirc = 0, contTri = 0, contPent = 0, contTrap = 0, contLos = 0;
        double x, altura, hipo, y, z;
        
        while(contQuad < quadrados.length){
            System.out.printf("Digite o lado do quadro %d e tecle enter, para parar digite 0:\n", contQuad + 1);
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            quadrados[contQuad] = new Quadrado(x);
            contQuad++;
        }
        
        
        while(contRet < retangulos.length){
            System.out.printf("\n\nDigite retângulo %d e tecle enter, para parar digite 0:\n", contRet + 1);
            System.out.println("Digite lado 1 do retângulo e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite lado 2 do retângulo e tecle enter");
            altura = entrada.nextDouble();
            if(x == 0 || altura == 0){
                break;
            }
            retangulos[contRet] = new Retangulo(x, altura);
            contRet++;
        }
        
        
        while(contCirc < circulos.length){
            System.out.printf("\n\nDigite o raio do circulo %d e tecle enter, para parar digite 0:\n", contCirc + 1);
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            circulos[contCirc] = new Circulo(x);
            contRet++;
        }
        
        
        while(contTri < triangulos.length){
            System.out.printf("\n\nDigite o triangulo %d e tecle enter, para parar digite 0:\n", contTri + 1);
            System.out.println("Digite a base do triangulo e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a altura do triangulo e tecle enter");
            altura = entrada.nextDouble();
            System.out.println("Digite a hipotenusa do triangulo e tecle enter");
            hipo = entrada.nextDouble();
            if(x == 0 || altura == 0 || hipo == 0){
                break;
            }
            triangulos[contTri] = new Triangulo(x, altura, hipo);
            contTri++;
        }
        
        
        while(contPent < pentagonos.length){
            System.out.printf("\n\nDigite o pentágono %d e tecle enter, para parar digite 0:\n", contPent + 1);
            System.out.println("Digite o lado do pentágono e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a apotema do pentágono e tecle enter");
            altura = entrada.nextDouble();
            if(x == 0 || altura == 0){
                break;
            }
            pentagonos[contPent] = new Pentagono(x, altura);
            contPent++;
        }
        
        
        while(contTrap < trapezios.length){
            System.out.printf("\n\nDigite o trapezio %d e tecle enter, para parar digite 0:\n", contTrap + 1);
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
            trapezios[contTrap] = new Trapezio(x, y, hipo, altura, z);
            contTrap++;
        }
        
        
        while(contLos < losangos.length){
            System.out.printf("\n\nDigite o losango %d e tecle enter, para parar digite 0:\n", contLos + 1);
            System.out.println("Digite a diagonal 1 do losango e tecle enter");
            x = entrada.nextDouble();
            System.out.println("Digite a diagonal 2 do losango e tecle enter");
            y = entrada.nextDouble();
            if(x == 0 || y == 0){
                break;
            }
            losangos[contPent] = new Losango(x, y);
            contLos++;
        }
        
        
    }
    
}
