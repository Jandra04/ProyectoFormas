
package logica;

public class Cuadrado extends Rectangulo {

    // Constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    // Getter y Setter
    public double getLado() {
        return getBase();
    }

    public void setLado(double lado) {
        super.setBase(lado);
        super.setAltura(lado);
    }

    // Mantener los lados iguales
    @Override
    public void setBase(double base) {
        setLado(base);
    }

    @Override
    public void setAltura(double altura) {
        setLado(altura);
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Cuadrado{lado=" + getLado() + "}";
    }

    // Comparar cuadrados
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Cuadrado)) {
            return false;
        }

        Cuadrado otro = (Cuadrado) obj;
        return Double.compare(getLado(), otro.getLado()) == 0;
    }
}
