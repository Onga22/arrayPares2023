import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int num = 0;
        int contPares=0;
        String numVal;


        for (int i = 0; contPares < 10 ; i++) {
            System.out.println("ingrese un numero : ");
            numVal=sc.nextLine();
            while (!numVal.matches("[0-9]*")){
                System.out.println("Error, ingreso un caracter no valido");
                System.out.println("Por favor ingrese otro numero");
                numVal=sc.nextLine();
            }
            num= Integer.parseInt(numVal);

            if(num%2==0){
                numeros.add(num);
                contPares++;
            }


        }
        int arrayPar[]=new int[contPares];
        contPares=0;

        for (int i = 0; i < 10; i++) {
        if(numeros.size() %2==0){
            arrayPar[contPares]=numeros.get(i);
            contPares++;
        }
            }
        System.out.println("Los primeros 10 numeros pares son: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print( arrayPar[i] + " - ");

        }

    }

}





