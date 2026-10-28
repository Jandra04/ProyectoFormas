
package logica;

public abstract class Figura implements Forma {

    // Constructor
    public Figura() {
    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract double calcularArea();

    @Override
    public void imprimirInformacion() {
        System.out.println("Figura: " + getClass().getSimpleName());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }

    @Override
    public String toString() {
        return "Figura: " + getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
