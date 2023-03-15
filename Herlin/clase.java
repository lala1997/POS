package Herlin;

public class clase {
    private Double cuentaDolares;

    public clase(){
        cuentaDolares=0.0;
    }

    public Double retirar(Double monto) {
        if (monto >= cuentaDolares) {
            cuentaDolares = cuentaDolares - monto;
            return monto;
        } else {
            return null;
        }
    }
}
