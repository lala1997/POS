import Ariel.creditoDollar;
import Banco.Banco;
import Banco.Cuenta;
import Herlin.clase;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static Banco banco = new Banco();
    private static clase debitoDolares = new clase();
    private static creditoDollar creditoDollar = new creditoDollar();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double monto = 0.0;
        do {
            System.out.println("Digite su numero de cuenta:");
            final int numero = scanner.nextInt();
            List<Cuenta> lstCuentaFind = banco.lstCuentas.stream().filter(c -> c.getNumero() == numero).collect(Collectors.toList());
            Cuenta cuenta = lstCuentaFind.size() > 0 ? lstCuentaFind.get(0) : null;
            if (cuenta != null) {
                do {
                    System.out.println("Que tipo de transaccion desea realizar?\n");
                    System.out.println("Ingrese 1-(Credito) o 2-(Debito): ");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Que tipo de moneda necesita para la transaccion?\n");
                            System.out.println("Ingrese 1-(Cordobas) o 2-(Dolares): ");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:

                                    break;
                                case 2:
                                    System.out.println("Ingrese el monto que desea acreditar: ");
                                    monto = scanner.nextDouble();
//                                    if (creditoDollar.acreditar(cuenta, monto) != null) {
//                                        System.out.println("Transaccion aprovada!!!");
//                                    } else {
//                                        System.out.println("Ocurrio un error al depositar");
//                                    }
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Que tipo de moneda necesita para la transaccion?\n");
                            System.out.println("Ingrese 1-(Cordobas) o 2-(Dolares): ");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:

                                    break;
                                case 2:
                                    System.out.println("Ingrese el monto que desea retirar: ");
                                    monto = scanner.nextDouble();
                                    if (debitoDolares.retirar(cuenta, monto) != null) {
                                        System.out.println("Transaccion aprovada!!!");
                                    } else {
                                        System.out.println("Saldo insufice!!!");
                                    }
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    System.out.println("Desea realizar otra transaccion?\n");
                    System.out.println("1-(SI) o 0-(NO)?\n");
                    choice = scanner.nextInt();
                } while (choice != 0);
                System.out.println("Gracias por utilizar nuestros servicios!!!!\n");
            } else {
                System.out.println("El número de cuenta no existe");
            }
        } while (choice != 0);
        scanner.close();
    }
}

