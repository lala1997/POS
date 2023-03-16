package Banco;

import lombok.Data;

@Data
public class Cuenta {
    private Integer numero;
    private Double monto;
    private Integer tipo;

    public Cuenta(Integer numero, Double monto, Integer tipo) {
        this.numero = numero;
        this.monto = monto;
        this.tipo = tipo;
    }
}
