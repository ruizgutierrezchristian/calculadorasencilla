import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Creamos el scanner para pedir a usuario los valores de las variables

        Scanner sc = new Scanner(System.in);

        //Creamos las variables

        double numero1, numero2, resultado;
        int opcion = 0;

        //Vamos a mostrar las opciones de la calculadora

        System.out.println("== Calculadora simple ==");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");

        //Ahora toca introducir tanto la opcion que vamos a seleccionar como los números con los que vamos a operar

        System.out.println("Selecciona una opción con el número de las opciones");
        opcion = sc.nextInt();

        System.out.println("Introduce el valor del primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el valor del segundo número");
        numero2 = sc.nextInt();
        //Ahora con lo seleccionado hacemos las funciones de la calculadora
        //seleccionando las opciones mostradas se realiza el cálculo

        if(opcion == 1){
           resultado = numero1 + numero2;
            System.out.println("Resultado:" + resultado);
        }

        if(opcion == 2){
            resultado = numero1-numero2;
            System.out.println("Resultado:" + resultado);
        }

        if(opcion == 3){
            resultado = numero1 * numero2;
            System.out.println("Resultado:" + resultado);
        }

        if (opcion == 4) {
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        }


        if (opcion == 5){
            resultado = Math.pow(numero1,numero2);
            System.out.println("Resultado:" + resultado);
        }

        if (opcion == 6){
            System.out.println("Saliendo del programa...");
        }

        if (opcion < 1 || opcion > 6){
            System.out.println("No has introducido ninguna opción valida");
        }
    }
}
