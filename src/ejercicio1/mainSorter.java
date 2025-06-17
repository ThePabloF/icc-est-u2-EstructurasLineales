package ejercicio1;

import controllers.StackG;

public class mainSorter {
    public static void main(String[] args) {
        StackG<Integer> miPila = new StackG<>();
        miPila.push(5);
        miPila.push(1);
        miPila.push(4);
        miPila.push(2);

        System.out.println("Pila antes de ordenar:");
        miPila.printStack();

        StackSorter sorter = new StackSorter();
        sorter.sortStack(miPila);

        System.out.println("\nPila después de ordenar:");
        miPila.printStack();
    }
}
