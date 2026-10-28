
package logica;

public class Isosceles extends Triangulo {

    // Constructor
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);

        if (ladoIgual == base) {
            throw new IllegalArgumentException("Los tres lados no pueden ser iguales");
        }
    }

    // Getters
    public double getLadoIgual() {
        return getLado1();
    }

    public double getBase() {
        return getLado3();
    }

    // Setters
    public void setLadoIgual(double ladoIgual) {
        actualizarLados(ladoIgual, ladoIgual, getBase());
    }

    public void setBase(double base) {
        actualizarLados(getLadoIgual(), getLadoIgual(), base);
    }

    // Mantener los dos lados iguales
    @Override
    public void setLado1(double lado1) {
        setLadoIgual(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        setLadoIgual(lado2);
    }

    @Override
    public void setLado3(double lado3) {
        setBase(lado3);
    }

    // Validar el tipo de triangulo
    @Override
    protected boolean correspondeTipo(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado1 != lado3;
    }
}
