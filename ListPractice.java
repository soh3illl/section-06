import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static List<Integer> add(List<Integer> l1, List<Integer> l2) {
        List<Integer> sum = new ArrayList<Integer>();

        int l1Size = l1.size();
        int l2Size = l2.size();


        for (int i = 0; i < l1Size || i < l2Size; i++) {
            if (i < l1Size && i < l2Size) {
                sum.add(l1.get(i) + l2.get(i));
            } else if (i < l1Size) {
                sum.add(l1.get(i));
            } else {
                sum.add(l2.get(i));
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        l2.add(1);
        l2.add(2);

        sum = add(l1, l2);
    }
}