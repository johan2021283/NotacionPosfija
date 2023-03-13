package gt.edu.umg.progra3.parcial1.pilas;

import java.util.Stack;

public class NotationParser {
   


    private Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
        Stack<String> stack = new Stack<>();
    String[] tokens = expression.split(" ");
    for (String token : tokens) {
        if (isOperand(token)) {
            stack.push(token);
        } else {
            String posFix = stack.pop();
            String posFix1 = stack.pop();
            String result = "(" + posFix + " " + token + " " + posFix + ")";
            stack.push(result);
        }
    }
    return stack.pop();
}

private boolean isOperand(String token) {
    return Character.isDigit(token.charAt(0));
}
}
        
    
    

