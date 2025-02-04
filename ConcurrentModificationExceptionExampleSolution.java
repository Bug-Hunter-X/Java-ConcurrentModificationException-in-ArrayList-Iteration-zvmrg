import java.util.*;
public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i == 3) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}