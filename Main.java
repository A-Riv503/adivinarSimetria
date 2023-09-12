import java.util.Scanner;

public class Main {
    /*Escribir un programa que puede determinar si una matriz de n elementos es simétrica. Una matriz es simétrica si se ve igual si está invertida.
      Por ejemplo ('a', 'b', 'c', 'd', 'd', 'c', 'b', 'a') es simétrica y ('a', 'b', 'c', 'd', 'd', 'b', 'c', 'a') no lo es. Suponga que n será siempre
      un número par entre 2 y 10 (No hay necesidad de validar esto). Si es simetrico su programa debe imprimir 'Symmetric', de lo contrario imprimir
      'Asymmetric' (Asegurar de retornar exactamente estas cadenas ya que cualquier diferencia producirá que la pregunta sea considerada como incorrecta)

      La salida de los datos para el arreglo en el ejemplo ('a', 'b', 'c', 'd', 'd', 'c', 'b', 'a') y n=8 sería:
      Symmetric
*/
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        datosMatriz();

    }

    public static void datosMatriz(){
        int n;



        System.out.println("ingrese el valor de n");
        n=scan.nextInt();


        char arreglo1[]=new char[n];
        

        llenarMatriz(arreglo1,n);

    }

    public static void llenarMatriz(char arreglo1[],int n){
        for(int i=0;i<n;i++){
            System.out.println("ingrese los elementos de su primer arreglo");
            arreglo1[i]=scan.next().charAt(0);
        }

        comprobarSimetria(arreglo1,n);

    }

    public static void comprobarSimetria(char arreglo1[],int n){
        boolean simetria=true;
        int i;

        for(i=0;i<n;i++){
            if(arreglo1[i]!=arreglo1[n-1-i]){
                simetria=false;
            }
        }

        if(simetria==true){
            System.out.println("Symmetric");
        }else{
            System.out.println("Asymmetric");
        }
    }
}