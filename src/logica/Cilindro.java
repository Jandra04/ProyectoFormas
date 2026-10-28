
package logica;

public class Cilindro extends Cuerpo {

    // Atributos
    private Circulo base;
    private double altura;

    // Constructor
    public Cilindro(Circulo base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Getters y Setters
    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        if (base == null || base.getRadio() <= 0) {
            throw new IllegalArgumentException("La base debe tener un radio positivo");
        }

        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser positiva");
        }

        this.altura = altura;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 2 * base.calcularPerimetro();
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return 2 * base.calcularArea() +
                base.calcularPerimetro() * altura;
    }

    // Calcular volumen
    @Override
    public double calcularVolumen() {
        return base.calcularArea() * altura;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Cilindro{radio=" + base.getRadio() +
                ", altura=" + altura + "}";
    }

    // Comparar cilindros
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Cilindro)) {
            return false;
        }

        Cilindro otro = (Cilindro) obj;

        return base.equals(otro.base) &&
                Double.compare(altura, otro.altura) == 0;
    }
}
