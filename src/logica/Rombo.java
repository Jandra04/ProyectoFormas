
package logica;

public class Rombo extends Figura {

    // Atributos
    private double diagonalMayor;
    private double diagonalMenor;

    // Constructor
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Getters y Setters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    // Calcular perimetro
    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(
                (diagonalMayor / 2) * (diagonalMayor / 2) +
                        (diagonalMenor / 2) * (diagonalMenor / 2)
        );

        return 4 * lado;
    }

    // Calcular area
    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Rombo{diagonalMayor=" + diagonalMayor +
                ", diagonalMenor=" + diagonalMenor + "}";
    }

    // Comparar rombos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rombo)) {
            return false;
        }

        Rombo otro = (Rombo) obj;

        return Double.compare(diagonalMayor, otro.diagonalMayor) == 0 &&
                Double.compare(diagonalMenor, otro.diagonalMenor) == 0;
    }
}
