package Prestamos;

public class Prestamos {
    private int id;
    private double monto;
    private String  fechaOtorgamiento;
    private double tasaInteres;
    private int plazo;

    // Constructor
    public Prestamos(int id, double monto, String fechaOtorgamiento, double tasaInteres, int plazo) {
        this.id = id;
        this.monto = monto;
        this.fechaOtorgamiento = fechaOtorgamiento;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
    }

    // Methods
    public double calcularCoutoMensual(double monto, double tasaInteres, int plazoMeses) {
        double tasaInteresMensual = tasaInteres / 12 / 100;
        double coutoMensual = monto * tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -plazoMeses));
        return coutoMensual;
    }

    public  double calcularInteresTotal(){
        double cuotaMensual = calcularCoutoMensual(monto, tasaInteres, plazo);
        double montoTotalPagar = cuotaMensual * plazo;
        double interesTotal = montoTotalPagar - monto;
        return interesTotal;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(String fechaOtorgamiento) {
        this.fechaOtorgamiento = fechaOtorgamiento;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
