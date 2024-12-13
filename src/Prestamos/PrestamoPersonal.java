package Prestamos;

public class PrestamoPersonal extends Prestamos {
    private String finalidad;
    private boolean garantia;
    private int plazoMaximo;
    private double tasaInteresMaxima;
    private double comisionApertura;
    private double comisionMora;
    private boolean seguroVida;

    // Constructor
    public PrestamoPersonal(int id, double monto, String fechaOtorgamiento, double tasaInteres, int plazo, String finalidad, boolean garantia, int plazoMaximo, double tasaInteresMaxima, double comisionApertura, double comisionMora, boolean seguroVida) {
        super(id, monto, fechaOtorgamiento, tasaInteres, plazo);
        this.finalidad = finalidad;
        this.garantia = garantia;
        this.plazoMaximo = plazoMaximo;
        this.tasaInteresMaxima = tasaInteresMaxima;
        this.comisionApertura = comisionApertura;
        this.comisionMora = comisionMora;
        this.seguroVida = seguroVida;
    }

    // Methods

    public double calcularMora(double monto, int diasAtraso) {
        return monto * comisionMora * diasAtraso;
    }

    public double calcularPago(double monto, int plazoMeses) {
        double cuotaMensual = calcularCoutoMensual(monto, tasaInteresMaxima, plazoMeses);
        return cuotaMensual * plazoMeses + comisionApertura + (seguroVida ? 100 : 0);
    }

    @Override
    public double calcularCoutoMensual(double monto, double tasaInteres, int plazoMeses) {
        return super.calcularCoutoMensual(monto, tasaInteres, plazoMeses);
    }

    @Override
    public double calcularInteresTotal() {
        return super.calcularInteresTotal();
    }


    // Getters and Setters

    public String getFinalidad() {
        return finalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public double getTasaInteresMaxima() {
        return tasaInteresMaxima;
    }

    public void setTasaInteresMaxima(double tasaInteresMaxima) {
        this.tasaInteresMaxima = tasaInteresMaxima;
    }

    public double getComisionApertura() {
        return comisionApertura;
    }

    public void setComisionApertura(double comisionApertura) {
        this.comisionApertura = comisionApertura;
    }

    public double getComisionMora() {
        return comisionMora;
    }

    public void setComisionMora(double comisionMora) {
        this.comisionMora = comisionMora;
    }

    public boolean isSeguroVida() {
        return seguroVida;
    }

    public void setSeguroVida(boolean seguroVida) {
        this.seguroVida = seguroVida;
    }
}

