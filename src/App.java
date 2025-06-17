// Source code is decompiled from a .class file using FernFlower decompiler.
import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import models.Persona;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      Stack stack = new Stack();
      stack.push(10);
      stack.push(-1);
      stack.push(0);
      stack.push(5);
      stack.printStack();
      stack.pop();
      stack.peek();
      stack.printStack();
      Cola cola = new Cola();
      cola.add(5);
      cola.add(7);
      cola.add(10);
      System.out.println("tam = " + cola.size);
      Persona p1 = new Persona("Pablo");
      Persona p2 = new Persona("Juan");
      Persona p3 = new Persona("Maria");
      ColaG<Persona> colaPersonas = new ColaG();
      colaPersonas.add(p1);
      colaPersonas.add(p2);
      colaPersonas.add(p3);
      System.out.println(colaPersonas.size());
      colaPersonas.printCola();
      System.out.println("Atiende a la persona => " + String.valueOf(colaPersonas.remove()));
      System.out.println(colaPersonas.size());
      colaPersonas.printCola();
   }
}
