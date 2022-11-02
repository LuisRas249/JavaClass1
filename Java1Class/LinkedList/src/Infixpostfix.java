import java.util.Scanner;

public class Infixpostfix {

    private static int precendence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    // this method represents a String infix expression
    // This then converts it into a String infixpostfix expression
    public static String infix2postfix(String infix) {

        //Initializing empty String for result
        String result = new String("");

        //Initializing empty stack
        Stack<Character> stack = new Stack<Character>();

        // iterate across each character in the infix string
        for (int i = 0; i < infix.length(); i++) {
            char nextChar = infix.charAt(i);

            //If the scanned character is an operand (number), add it to the output
            if (Character.isDigit(nextChar))
                result = result + nextChar;

                //If the scanned character is an '(', push it to the stack
            else if (nextChar == '(')
                stack.push(nextChar);

                //If the scanned character is an ')', pop and output from the stack until
                // an '(' is encountered
            else if (nextChar == ')') {
                while (stack.peek() != '(')
                    result = result + stack.pop();

                stack.pop(); // Thow away the '(' that is now on top of the stack
            }
            // an operator is encountered
            else
            {
                /*
                Add to the output, every operator on the stack with a precendence
                greater than or equal to the precendence of the operator found
                 */
                while (!stack.isEmpty() && precendence(nextChar) <= precendence(stack.peek())){
                    result = result + stack.pop();
                }
                // This will push the found operator on to the stack
                stack.push(nextChar);
            }
        }

        //pop all the operators from the stack
        // Whatevers left on the stack gets popped one at a time
        // Then it is added onto the result which we then return
        while (!stack.isEmpty()){
            result = result + stack.pop();
        }
        return result;
    }

    // Create an evaluation method for it
    static int evalutatePostfix(String postfix){

        //Create a stack of integer objects
        Stack<Integer> stack = new Stack<Integer>();

        //Scan all characters one by one
        for(int i = 0; i < postfix.length(); i++){
            // This takes the postfix string from position 0,1,2,3 .....
            char nextChar = postfix.charAt(i);

            //If the scanned character is an operand (number here)
            //push it to the stack
            if (Character.isDigit(nextChar))
                stack.push( nextChar - '0');// Convert the character into the equivalent integer

            //if the scanned character is an operator, pop two
            //elements from the stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (nextChar){
                    case '+':
                    stack.push(val2 + val1);
                    break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '^':
                        // Math.pow is used to raise val2 to the power of val1
                        // (int) so that it is converted into an into before pushing it into the stack
                        stack.push((int)Math.pow(val2, val1));
                        break;
                }

            }
        }
        // Returning the result
        return stack.pop();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Create a menu option allowing the user to enter an infix expression
        System.out.println("Enter an infix expression (no spaces) > ");
        String infix = input.nextLine();

        // Print the results
        System.out.println("Postfix is :" + infix2postfix(infix));
        System.out.println("Result is " + evalutatePostfix(infix2postfix(infix)));
    }
}
