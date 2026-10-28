
package logica;

public class Equilatero extends Triangulo {

    // Constructor
    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    // Getter y Setter
    public double getLado() {
        return getLado1();
    }

    public void setLado(double lado) {
        actualizarLados(lado, lado, lado);
    }

    // Mantener los tres lados iguales
    @Override
    public void setLado1(double lado1) {
        setLado(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        setLado(lado2);
    }

    @Override
    public void setLado3(double lado3) {
        setLado(lado3);
    }

    // Validar el tipo de triangulo
    @Override
    protected boolean correspondeTipo(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado2 == lado3;
    }
}
