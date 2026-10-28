
package logica;

public abstract class Triangulo extends Figura {

    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        validarTriangulo(lado1, lado2, lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Validar las medidas
    private void validarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
                lado1 + lado2 <= lado3 ||
                lado1 + lado3 <= lado2 ||
                lado2 + lado3 <= lado1) {

            throw new IllegalArgumentException("Los lados no forman un triangulo");
        }
    }

    // Validar el tipo de triangulo
    protected abstract boolean correspondeTipo(double lado1, double lado2, double lado3);

    private void validarCambio(double lado1, double lado2, double lado3) {
        validarTriangulo(lado1, lado2, lado3);

        if (!correspondeTipo(lado1, lado2, lado3)) {
            throw new IllegalArgumentException("Las medidas cambian el tipo de triangulo");
        }
    }

    // Getters y Setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        validarCambio(lado1, lado2, lado3);
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        validarCambio(lado1, lado2, lado3);
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        validarCambio(lado1, lado2, lado3);
        this.lado3 = lado3;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Calcular area
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;

        return Math.sqrt(s * (s - lado1) *
                (s - lado2) * (s - lado3));
    }

    // Convertir a texto
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 + "}";
    }

    // Comparar triangulos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangulo otro = (Triangulo) obj;

        return Double.compare(lado1, otro.lado1) == 0 &&
                Double.compare(lado2, otro.lado2) == 0 &&
                Double.compare(lado3, otro.lado3) == 0;
    }


    // Actualizar los tres lados
    protected void actualizarLados(double lado1, double lado2, double lado3) {
        validarCambio(lado1, lado2, lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

}
