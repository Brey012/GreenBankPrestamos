package Prestamos;

public abstract class Prestamos {
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

    // Method

    public double calcularInteresTotal() {
        double cuotaMensual = calcularCuotaMensual();
        double montoTotalPagar = cuotaMensual * plazo;
        double interesTotal = montoTotalPagar - monto;
        return interesTotal;
    }

    public double calcularCuotaMensual() {
        double tasaInteresMensual = this.tasaInteres / 12 / 100;
        int plazoMeses = this.plazo;
        double cuotaMensual = (this.monto * tasaInteresMensual * Math.pow(1 + tasaInteresMensual, plazoMeses)) / (Math.pow(1 + tasaInteresMensual, plazoMeses) - 1);
        return cuotaMensual;
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
