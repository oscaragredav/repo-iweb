public class Arma extends Objeto{

    private double poder;
    private double valentia;

    public Arma(double poder, double valentia) {
        this.setPoder(poder=0);
        this.setValentia(valentia=0);
    }


    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public double getValentia() {
        return valentia;
    }

    public void setValentia(double valentia) {
        this.valentia = valentia;
    }
}
