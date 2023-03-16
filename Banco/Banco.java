package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
    List<CuentaCordobas> lstCuentasCordobas= new ArrayList<>();
    List<CuentaDolares> lstCuentasDolares= new ArrayList<>();

    Random rCuenta;
    Random rMonto;
    public void Banco(){
        for(int i=0;i<=100;i++){
            CuentaCordobas cCordobas = new CuentaCordobas(rCuenta.nextInt(),rMonto.nextDouble());
            CuentaDolares cDolares = new CuentaDolares(rCuenta.nextInt(),rMonto.nextDouble());
            lstCuentasCordobas.add(cCordobas);
            lstCuentasDolares.add(cDolares);
        }
    }
}
