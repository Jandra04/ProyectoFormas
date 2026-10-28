
package logica;

import java.util.ArrayList;

public class Coleccion {

    // Atributos
    private ArrayList<Figura> figuras;
    private ArrayList<Cuerpo> cuerpos;

    // Constructor
    public Coleccion() {
        figuras = new ArrayList<>();
        cuerpos = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Figura> getFiguras() {
        return new ArrayList<>(figuras);
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        if (figuras == null || figuras.contains(null)) {
            throw new IllegalArgumentException("La lista de figuras no es valida");
        }

        this.figuras = new ArrayList<>(figuras);
    }

    public ArrayList<Cuerpo> getCuerpos() {
        return new ArrayList<>(cuerpos);
    }

    public void setCuerpos(ArrayList<Cuerpo> cuerpos) {
        if (cuerpos == null || cuerpos.contains(null)) {
            throw new IllegalArgumentException("La lista de cuerpos no es valida");
        }

        this.cuerpos = new ArrayList<>(cuerpos);
    }

    // Agregar figura
    public void agregarFigura(Figura figura) {
        if (figura == null) {
            throw new IllegalArgumentException("La figura no es valida");
        }

        figuras.add(figura);
    }

    // Agregar cuerpo
    public void agregarCuerpo(Cuerpo cuerpo) {
        if (cuerpo == null) {
            throw new IllegalArgumentException("El cuerpo no es valido");
        }

        cuerpos.add(cuerpo);
    }

    // Listar figuras
    public void listarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas");
            return;
        }

        for (Figura figura : figuras) {
            figura.imprimirInformacion();
            System.out.println();
        }
    }

    // Listar cuerpos
    public void listarCuerpos() {
        if (cuerpos.isEmpty()) {
            System.out.println("No hay cuerpos registrados");
            return;
        }

        for (Cuerpo cuerpo : cuerpos) {
            cuerpo.imprimirInformacion();
            System.out.println();
        }
    }

    // Calcular area total
    public double calcularAreaTotal() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularArea();
        }

        return total;
    }

    // Calcular perimetro total
    public double calcularPerimetroTotal() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularPerimetro();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularPerimetro();
        }

        return total;
    }

    // Calcular volumen total
    public double calcularVolumenTotal() {
        double total = 0;

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularVolumen();
        }

        return total;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Coleccion{figuras=" + figuras.size() +
                ", cuerpos=" + cuerpos.size() + "}";
    }

    // Comparar colecciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Coleccion)) {
            return false;
        }

        Coleccion otra = (Coleccion) obj;

        return figuras.equals(otra.figuras) &&
                cuerpos.equals(otra.cuerpos);
    }
}
