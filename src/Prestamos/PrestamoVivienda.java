package Prestamos;

import Prestamos.Prestamos;

public class PrestamoVivienda extends Prestamos {
    private String tipoVivienda;
    private String ciudad;
    private double valorVivienda;
    private double porcentajeFinanciado;

    // Constructor
    public PrestamoVivienda(int id, double monto, String fechaOtorgamiento, double tasaInteres, int plazo, String tipoVivienda, String ciudad, double valorVivienda, double porcentajeFinanciado) {
        super(id, monto, fechaOtorgamiento, tasaInteres, plazo);
        this.tipoVivienda = tipoVivienda;
        this.ciudad = ciudad;
        this.valorVivienda = valorVivienda;
        this.porcentajeFinanciado = porcentajeFinanciado;
    }

    // Methods
    public double calcularCuotaIncial() {
        double porcentajeFinanciado = this.porcentajeFinanciado / 100;
        double montoAFinanciar = this.valorVivienda * porcentajeFinanciado;
        return valorVivienda - montoAFinanciar;
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
    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getValorVivienda() {
        return valorVivienda;
    }

    public void setValorVivienda(double valorVivienda) {
        this.valorVivienda = valorVivienda;
    }

    public double getPorcentajeFinanciado() {
        return porcentajeFinanciado;
    }

    public void setPorcentajeFinanciado(double porcentajeFinanciado) {
        this.porcentajeFinanciado = porcentajeFinanciado;
    }

}
