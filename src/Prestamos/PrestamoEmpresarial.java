package Prestamos;

public class PrestamoEmpresarial extends Prestamos {

    private String nombreEmpresa;
    private String sectorEcnonomico;
    private String planNegocio;
    private double evaluacionRiesgo;
    private String destinoFondos;

    // Constructor


    public PrestamoEmpresarial(int id, double monto, String fechaOtorgamiento, double tasaInteres, int plazo, String nombreEmpresa, String sectorEcnonomico, String planNegocio, double evaluacionRiesgo, String destinoFondos) {
        super(id, monto, fechaOtorgamiento, tasaInteres, plazo);
        this.nombreEmpresa = nombreEmpresa;
        this.sectorEcnonomico = sectorEcnonomico;
        this.planNegocio = planNegocio;
        this.evaluacionRiesgo = evaluacionRiesgo;
        this.destinoFondos = destinoFondos;
    }

    // Methods


    @Override
    public double calcularInteresTotal() {
        return super.calcularInteresTotal();
    }

    @Override
    public double calcularCuotaMensual() {
        return super.calcularCuotaMensual();
    }

    // Getters and Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getSectorEcnonomico() {
        return sectorEcnonomico;
    }

    public void setSectorEcnonomico(String sectorEcnonomico) {
        this.sectorEcnonomico = sectorEcnonomico;
    }

    public String getPlanNegocio() {
        return planNegocio;
    }

    public void setPlanNegocio(String planNegocio) {
        this.planNegocio = planNegocio;
    }

    public double getEvaluacionRiesgo() {
        return evaluacionRiesgo;
    }

    public void setEvaluacionRiesgo(double evaluacionRiesgo) {
        this.evaluacionRiesgo = evaluacionRiesgo;
    }

    public String getDestinoFondos() {
        return destinoFondos;
    }

    public void setDestinoFondos(String destinoFondos) {
        this.destinoFondos = destinoFondos;
    }
}
