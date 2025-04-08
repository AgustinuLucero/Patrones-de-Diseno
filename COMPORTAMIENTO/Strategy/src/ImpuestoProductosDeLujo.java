// Estrategia concreta: Impuesto para productos de lujo
class ImpuestoProductosDeLujo implements EstrategiaImpuesto {
    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.20; // 20% de impuesto
    }
}
