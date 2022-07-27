public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a MyStack object
        MyStack firstStack = new MyStack();

        // Push objects on to stack1
        System.out.println("Pushing the number 4, 5, and 6 to 1st stack! DEBUG: it works!");
        firstStack.push(new Integer(4)); // we basically create
        firstStack.push(new Integer(5));
        firstStack.push(new Integer(6));

        // Clone stack1 and assign the clone to stack2
        System.out.println("Cloning 1st stack...");
        MyStack secondStack = (MyStack)firstStack.clone();

        // Pop an object from stack1
        System.out.println("Popping object from 1st stack! DEBUG: it works!");
        firstStack.pop();

        // Display results
        System.out.print("1st ");
        System.out.println(firstStack);
        System.out.print("2nd ");
        System.out.println(secondStack);
        System.out.println("Is the 1st stack equal to the 2nd? DEBUG: it works!\n" +
                (firstStack == secondStack));
    }
}