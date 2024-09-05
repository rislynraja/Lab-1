public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;

    private final double MPG_E = 33.7;

    public double calcGasMPG() {
        gasMPG
        return gasMPG;
    }

    public double calcMPGe() {
        MpgE = (miles/kWh) * MPG_E;
        return  MpgE;
    }

}
