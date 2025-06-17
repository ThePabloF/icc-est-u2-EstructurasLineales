package ejercicio2;

import controllers.StackG;

public class SignValidator {

    public Boolean validarSign (String validar){

        StackG<Character> sG = new StackG<>();

        for (char caracter : validar.toCharArray()) {
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                sG.push(caracter);
            }else {
            if (sG.isEmpty()) {
                return false;
            }

            char top = sG.peek();
            if ((caracter == ')' && top == '(') ||
                (caracter == ']' && top == '[') ||
                (caracter == '}' && top == '{')) {
                sG.pop();
            } else {
                return false;
            }
        }
    }

            return sG.isEmpty();
    }
}

    



