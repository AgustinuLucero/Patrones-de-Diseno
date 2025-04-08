// Contexto: Clase que utiliza una estrategia de cálculo de impuestos
class CalculadoraImpuestos {
    private EstrategiaImpuesto estrategiaImpuesto;

    // Permite configurar la estrategia de cálculo de impuestos
    public void setEstrategiaImpuesto(EstrategiaImpuesto estrategiaImpuesto) {
        this.estrategiaImpuesto = estrategiaImpuesto;
    }

    // Calcula el impuesto utilizando la estrategia seleccionada
    public double calcular(double monto) {
        if (estrategiaImpuesto == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de impuesto.");
        }
        return estrategiaImpuesto.calcularImpuesto(monto);
    }
}