import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println(set);
        System.out.println(set.contains(4));
        System.out.println(set.remove(5));
        System.out.println(set);
    }
}
