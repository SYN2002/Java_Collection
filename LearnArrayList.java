import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> studentRoll=new ArrayList<>();
        studentRoll.add(1);
        studentRoll.add(3);
        studentRoll.add(4);
        studentRoll.add(5);
        studentRoll.add(6);
        studentRoll.add(7);
        studentRoll.add(8);
        System.out.println(studentRoll);
        studentRoll.add(1, 2);
        System.out.println(studentRoll);
        studentRoll.remove(0);
        System.out.println(studentRoll);
        studentRoll.remove(Integer.valueOf(5));
        System.out.println(studentRoll);
        studentRoll.set(3, 100);
        System.out.println(studentRoll);
        System.out.println(studentRoll.contains(100));
    }
}
