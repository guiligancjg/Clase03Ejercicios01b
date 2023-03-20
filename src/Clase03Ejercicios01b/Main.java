package Clase03Ejercicios01b;

public class Main {

    public static void main(String[] args) {
        //1b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
        //3. Realizar el ejercicio 1 (De esta misma guía) enviando los valores por parámetro.
        int num01 = 125, num02 = 2560, num03 = 11;//Dados 3 números
        boolean orden = true; //true es "ascendente" y false "decreciente"
        int vector[] = numerosOrdenados(num01,num02,num03,orden);

        System.out.println("Numeros ordenados: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(vector[i]);
        }
    }

    public static int[] numerosOrdenados(int a, int b, int c, boolean orden){
        int[] numeros = {a,b,c};//retorna a un vector de 3
        int temp = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (orden) {
                    if (numeros[j] > numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                } else {
                    if (numeros[j] < numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }

        return numeros;
    }
}
