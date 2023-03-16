package src.main.java.Douglas;

public class debitoCordoba {

    private String cuenta;
    private double saldo;
    private double monto;

    public debitoCordoba(){}

    public debitoCordoba(double saldo, double monto){
        this.saldo=saldo;
        this.monto=monto;
    }
    public double efectuarDebitoCorboda(final Double lado){
      if ((saldo - monto) < 0) {
          return 0;
      } else {
          return saldo - monto;
      }
    }


}
