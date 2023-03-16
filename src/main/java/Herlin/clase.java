package src.main.java.Herlin;

import src.main.java.Banco.Cuenta;
import lombok.Data;

@Data
public class clase {
    public clase(){

    }

    public Double retirar(Cuenta cuenta,Double monto) {
        if (monto <= cuenta.getMonto()) {
            cuenta.setMonto( cuenta.getMonto() - monto);
            return cuenta.getMonto();
        } else {
            return null;
        }
    }
}
