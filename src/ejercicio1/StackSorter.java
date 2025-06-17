package ejercicio1;

import controllers.StackG;
import models.Node;

public class StackSorter {

    public void sortStack(StackG<Integer> stack){
        StackG<Integer> stackR = new StackG<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!stackR.isEmpty() && stackR.peek() > temp ) {
                stack.push(stackR.pop());
            }

            stackR.push(temp);


        }
        while (!stackR.isEmpty()) {
        stack.push(stackR.pop());
    }
    }
     
}
