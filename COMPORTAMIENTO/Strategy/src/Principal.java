public class Principal {
    public static void main(String[] args) throws Exception {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        // Usar la estrategia de impuesto para productos básicos
        calculadora.setEstrategiaImpuesto(new ImpuestoProductosBasicos());
        System.out.println("Impuesto para productos básicos: " + calculadora.calcular(1000));

        // Cambiar a la estrategia de impuesto para productos de lujo
        calculadora.setEstrategiaImpuesto(new ImpuestoProductosDeLujo());
        System.out.println("Impuesto para productos de lujo: " + calculadora.calcular(1000));
    }
}