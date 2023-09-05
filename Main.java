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
        int matriz[][];
        int numFilas;
        int numColumnas;

        System.out.println("ingrese el numero de filas de su matriz");
        numFilas=scan.nextInt();
        System.out.println("ingrese el numero de columnas");
        numColumnas=scan.nextInt();

        matriz=new int[numFilas][numColumnas];

        llenarMatriz(matriz,numFilas,numColumnas);

    }

    public static void llenarMatriz(int matriz[][],int numFilas,int numColumnas){
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<numColumnas;j++){
                System.out.println("ingrese los elementos de su matriz en la pocicion "+i+" y "+j);
                matriz[i][j]=scan.nextInt();
            }
        }
        comprobarSimetria(matriz,numFilas,numColumnas);

    }

    public static void comprobarSimetria(int matriz[][],int numFilas, int numColumnas){
        boolean simetria=true;
        if(numFilas==numColumnas){
            int i,j;
            i=0;
            while(i<numFilas && simetria==true){
                j=0;
                while(j<numColumnas && simetria==true){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetria=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetria==true){
                System.out.println("Symmetric");
            }else{
                System.out.println("Asymmetric");
            }
        }else{
            System.out.println("Asymmetric");

        }
    }
}