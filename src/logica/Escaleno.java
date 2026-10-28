
package logica;

public class Escaleno extends Triangulo {

    // Constructor
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);

        if (!correspondeTipo(lado1, lado2, lado3)) {
            throw new IllegalArgumentException("Los tres lados deben ser diferentes");
        }
    }

    // Validar el tipo de triangulo
    @Override
    protected boolean correspondeTipo(double lado1, double lado2, double lado3) {
        return lado1 != lado2 &&
                lado1 != lado3 &&
                lado2 != lado3;
    }
}
