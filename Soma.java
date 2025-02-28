import java.util.Scanner;

    public class Soma {
        public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        
           System.out.println("Digite o primeiro número para somar");
            Double priNumero = sc.nextDouble();


           System.out.println("Digite o segundo número para somar");
           Double segNumero= sc.nextDouble();

           Double resultado = priNumero + segNumero;

            System.out.println("Resultado: " + resultado);

            }
    }
