package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;
import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PRUEBAS DE PILA ---");
        StackLinked stack = new StackLinked();
        
        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Vacia? " + stack.isEmpty()); 
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Vacia? " + stack.isEmpty()); 
        
        System.out.println("\n--- INICIANDO PRUEBAS DE VALIDADOR ---");
        SymbolValidator symbolValidator = new SymbolValidator();
        System.out.println("Caso (a+b) * [c-d]: " + symbolValidator.isBalanced("(a+b) * [c-d]")); // true
        System.out.println("Caso ([)]: " + symbolValidator.isBalanced("([)]")); // false
    }
}
