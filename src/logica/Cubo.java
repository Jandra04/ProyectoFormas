
package logica;

public class Cubo extends Cuerpo {

    // Atributo por asociacion
    private Cuadrado cara;

    // Constructor
    public Cubo(Cuadrado cara) {
        setCara(cara);
    }

    // Getter y Setter
    public Cuadrado getCara() {
        return cara;
    }

    public void setCara(Cuadrado cara) {
        if (cara == null || cara.getLado() <= 0) {
            throw new IllegalArgumentException("La cara debe tener un lado positivo");
        }

        this.cara = cara;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 12 * cara.getLado();
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return 6 * cara.calcularArea();
    }

    // Calcular volumen
    @Override
    public double calcularVolumen() {
        return cara.calcularArea() * cara.getLado();
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Cubo{lado=" + cara.getLado() + "}";
    }

    // Comparar cubos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Cubo)) {
            return false;
        }

        Cubo otro = (Cubo) obj;
        return cara.equals(otro.cara);
    }
}
