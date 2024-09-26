package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        int Y = 5;
        whileLoop(Y);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {

        int X = 0;

        while (X < num) {
            // Mostrar mensaje con el valor actual de X y el valor que tendrá en la siguiente iteración
            System.out.println(X+" < "+num+". El proximo ciclo valdra: "+(X+1));
            X++; // Aumentar X en una unidad
        }
    }
}