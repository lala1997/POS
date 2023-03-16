package Banco;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Banco {
    public List<Cuenta> lstCuentas = new ArrayList<>();
    Random r= new Random();

    public Banco() {
        for (int i = 0; i <= 100; i++) {
            Cuenta cuenta = new Cuenta(i + 1, 0.0, r.nextInt(2) + 1);
            lstCuentas.add(cuenta);
        }
    }
}
