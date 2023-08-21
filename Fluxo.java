import java.util.Scanner;

public class Fluxo {

    public static void main(String args[]){
        int media = 0;
        int media2 = getMedia(media);
        System.out.println("A média é:" + media2 );

        if(media2 >= 7){
            System.out.println("Você passou!!!");
        }
        else if(media2 >= 5){
            System.out.println("Você está de recuperação");
        }
        else{
            System.out.println("Você reprovou");
        }
    }

    public static int getMedia(int media){
        System.out.println("Digite a primeira nota: ");
        Scanner num1 = new Scanner(System.in);
        int nota1 = num1.nextInt();
        System.out.println("Digite a segunda nota: ");
        Scanner num2 = new Scanner(System.in);
        int nota2 = num2.nextInt();
        System.out.println("Digite a terceira nota: ");
        Scanner num3 = new Scanner(System.in);
        int nota3 = num3.nextInt();
        System.out.println("Digite a quarta nota: ");
        Scanner num4 = new Scanner(System.in);
        int nota4 = num4.nextInt();

        int m = (nota1 + nota2 + nota3 + nota4) / 4;

        return m;
    }


}
