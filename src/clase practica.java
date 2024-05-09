//ZAHID ENRRIQUE ESQUIVEL LAINEZ
//CARNET-- 2024-1693U
//GRUPO 1M7-S

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());

        String[] inventario = new String[cantidadProductos];

        for (int i = 0; i < inventario.length; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": ");
            inventario[i] = scanner.nextLine();
        }

        System.out.print("Ingrese el producto que desea buscar: ");
        String productoBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (String producto : inventario) {
            if (producto.equalsIgnoreCase(productoBuscado)) {//
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El producto \"" + productoBuscado + "\" está disponible en el inventario.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no está disponible en el inventario.");
        }

        scanner.close();
    }
}