// Estrategia concreta: Impuesto para productos básicos
class ImpuestoProductosBasicos implements EstrategiaImpuesto {
    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.05; // 5% de impuesto
    }
}
