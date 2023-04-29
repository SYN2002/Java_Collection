import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal=new Stack<>();
        animal.push("Lyon");
        animal.push("Tiger");
        animal.push("Gorila");
        animal.push("Horse");
        System.out.println(animal);
        animal.pop();
        System.out.println(animal);
        System.out.println(animal.peek());
    }
}
