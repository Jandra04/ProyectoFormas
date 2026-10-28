
package logica;

public class Tetraedro extends Cuerpo {

    // Atributo por asociacion
    private Equilatero cara;

    // Constructor
    public Tetraedro(Equilatero cara) {
        setCara(cara);
    }

    // Getter y Setter
    public Equilatero getCara() {
        return cara;
    }

    public void setCara(Equilatero cara) {
        if (cara == null || cara.getLado() <= 0) {
            throw new IllegalArgumentException("La cara debe tener un lado positivo");
        }

        this.cara = cara;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 6 * cara.getLado();
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return 4 * cara.calcularArea();
    }

    // Calcular volumen
    @Override
    public double calcularVolumen() {
        double altura = Math.sqrt(2.0 / 3.0) * cara.getLado();

        return (cara.calcularArea() * altura) / 3;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Tetraedro{lado=" + cara.getLado() + "}";
    }

    // Comparar tetraedros
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Tetraedro)) {
            return false;
        }

        Tetraedro otro = (Tetraedro) obj;
        return cara.equals(otro.cara);
    }
}
