
import java.util.Scanner;
import models.Circulo;
import models.Quadrado;
import models.Retangulo;

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
        int contQuad = 0, contRet = 0, contCirc = 0;
        double x, y;
        
        System.out.println("Digite o quadro e tecle enter, para parar digite 0");
        while(contQuad < quadrados.length){
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            quadrados[contQuad] = new Quadrado(x);
        }
        
        System.out.println("Digite os lados do retângulo e tecle enter, para parar digite 0");
        while(contQuad < retangulos.length){
            x = entrada.nextDouble();
            y = entrada.nextDouble();
            if(x == 0 || y == 0){
                break;
            }
            retangulos[contRet] = new Retangulo(x, y);
        }
        
        System.out.println("Digite o circulo e tecle enter, para parar digite 0");
        while(contCirc < circulos.length){
            x = entrada.nextDouble();
            if(x == 0){
                break;
            }
            circulos[contCirc] = new Circulo(x);
        }
        
        
    }
    
}
