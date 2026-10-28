
package logica;

public class Circulo extends Figura {

    // Atributo
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Circulo{radio=" + radio + "}";
    }

    // Comparar circulos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Circulo)) {
            return false;
        }

        Circulo otro = (Circulo) obj;
        return Double.compare(radio, otro.radio) == 0;
    }
}
