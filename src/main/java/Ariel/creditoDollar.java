package Ariel;

import java.util.Scanner;

public class creditoDollar {

    public class CreditoDollar (int Saldo, double monto){

            final int saldo_inicial=100;

            double ingreso,saldoActual,retiro ;
            Scanner entrada=new Scanner(System.in);




            System.out.print("Ingresar Monto en dolares a retirar:");


                    System.out.println("Digite la cantidad que desea ingresar en cuenta: ");
                    ingreso=entrada.nextDouble();
                    saldoActual=saldo_inicial-ingreso;
                    System.out.println("El saldo Actual es: " + saldoActual);

            }

    }
}
