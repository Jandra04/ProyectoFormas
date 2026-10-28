
package logica;

public class Esfera extends Cuerpo {

    // Atributo
    private double radio;

    // Constructor
    public Esfera(double radio) {
        setRadio(radio);
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser positivo");
        }

        this.radio = radio;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 0;
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    // Calcular volumen
    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Esfera{radio=" + radio + "}";
    }

    // Comparar esferas
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Esfera)) {
            return false;
        }

        Esfera otra = (Esfera) obj;

        return Double.compare(radio, otra.radio) == 0;
    }
}
