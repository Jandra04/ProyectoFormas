
package logica;

public abstract class Cuerpo implements Forma {

    // Constructor
    public Cuerpo() {
    }

    // Calcular perimetro
    @Override
    public abstract double calcularPerimetro();

    // Calcular area
    @Override
    public abstract double calcularArea();

    // Calcular volumen
    public abstract double calcularVolumen();

    // Imprimir informacion
    @Override
    public void imprimirInformacion() {
        System.out.println("Cuerpo: " + getClass().getSimpleName());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Cuerpo: " + getClass().getSimpleName();
    }

    // Comparar cuerpos
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
