
package interfazUsuario;

import logica.*;
import java.util.Scanner;

public class Menu {

    // Atributos
    private Scanner entrada;
    private Coleccion coleccion;

    // Constructor
    public Menu() {
        entrada = new Scanner(System.in);
        coleccion = new Coleccion();
    }

    // Menu principal
    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\nMenu principal");
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Calcular area total");
            System.out.println("6. Calcular perimetro total");
            System.out.println("7. Calcular volumen total");
            System.out.println("0. Salir");

            opcion = leerEntero("Seleccione una opcion: ");

            try {
                switch (opcion) {
                    case 1:
                        agregarFigura();
                        break;
                    case 2:
                        agregarCuerpo();
                        break;
                    case 3:
                        coleccion.listarFiguras();
                        break;
                    case 4:
                        coleccion.listarCuerpos();
                        break;
                    case 5:
                        System.out.println("Area total: " +
                                coleccion.calcularAreaTotal());
                        break;
                    case 6:
                        System.out.println("Perimetro total: " +
                                coleccion.calcularPerimetroTotal());
                        break;
                    case 7:
                        System.out.println("Volumen total: " +
                                coleccion.calcularVolumenTotal());
                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 0);
    }

    // Agregar una figura
    private void agregarFigura() {
        System.out.println("\nAgregar figura");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rombo");
        System.out.println("5. Triangulo");

        int opcion = leerEntero("Seleccione una figura: ");
        Figura figura;

        switch (opcion) {
            case 1:
                figura = new Circulo(leerPositivo("Radio: "));
                break;
            case 2:
                figura = new Rectangulo(
                        leerPositivo("Base: "),
                        leerPositivo("Altura: "));
                break;
            case 3:
                figura = new Cuadrado(leerPositivo("Lado: "));
                break;
            case 4:
                double mayor = leerPositivo("Diagonal mayor: ");
                double menor = leerPositivo("Diagonal menor: ");

                if (menor > mayor) {
                    throw new IllegalArgumentException(
                            "La diagonal menor no puede ser mayor");
                }

                figura = new Rombo(mayor, menor);
                break;
            case 5:
                double lado1 = leerPositivo("Lado 1: ");
                double lado2 = leerPositivo("Lado 2: ");
                double lado3 = leerPositivo("Lado 3: ");

                figura = crearTriangulo(lado1, lado2, lado3);
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }

        coleccion.agregarFigura(figura);
        System.out.println("Figura agregada: " +
                figura.getClass().getSimpleName());
    }

    // Determinar el tipo de triangulo
    private Figura crearTriangulo(double lado1, double lado2, double lado3) {

        if (lado1 == lado2 && lado2 == lado3) {
            return new Equilatero(lado1);
        }

        if (lado1 == lado2) {
            return new Isosceles(lado1, lado3);
        }

        if (lado1 == lado3) {
            return new Isosceles(lado1, lado2);
        }

        if (lado2 == lado3) {
            return new Isosceles(lado2, lado1);
        }

        return new Escaleno(lado1, lado2, lado3);
    }

    // Agregar un cuerpo
    private void agregarCuerpo() {
        System.out.println("\nAgregar cuerpo");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Tetraedro");
        System.out.println("4. Esfera");

        int opcion = leerEntero("Seleccione un cuerpo: ");
        Cuerpo cuerpo;

        switch (opcion) {
            case 1:
                cuerpo = new Cubo(
                        new Cuadrado(leerPositivo("Lado: ")));
                break;
            case 2:
                double radio = leerPositivo("Radio: ");
                double altura = leerPositivo("Altura: ");

                cuerpo = new Cilindro(new Circulo(radio), altura);
                break;
            case 3:
                cuerpo = new Tetraedro(
                        new Equilatero(leerPositivo("Lado: ")));
                break;
            case 4:
                cuerpo = new Esfera(leerPositivo("Radio: "));
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }

        coleccion.agregarCuerpo(cuerpo);
        System.out.println("Cuerpo agregado: " +
                cuerpo.getClass().getSimpleName());
    }

    // Leer numeros enteros
    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                return Integer.parseInt(entrada.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero entero");
            }
        }
    }

    // Leer medidas positivas
    private double leerPositivo(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                double numero = Double.parseDouble(
                        entrada.nextLine().trim());

                if (Double.isFinite(numero) && numero > 0) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                // El mensaje se muestra abajo
            }

            System.out.println("Ingrese un numero mayor que cero");
        }
    }

    // Getter de la coleccion
    public Coleccion getColeccion() {
        return coleccion;
    }

    // Convertir a texto
    @Override
    public String toString() {
        return "Menu del proyecto de formas";
    }
}
