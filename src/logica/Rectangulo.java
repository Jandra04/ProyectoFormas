
package logica;

public class Rectangulo extends Figura {

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Rectangulo{base=" + base +
                ", altura=" + altura + "}";
    }

    // Comparar rectangulos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rectangulo otro = (Rectangulo) obj;

        return Double.compare(base, otro.base) == 0 &&
                Double.compare(altura, otro.altura) == 0;
    }
}
