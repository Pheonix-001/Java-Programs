import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALvsLLtime {

    public static void main(String[] args) {

        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        getTime(al);
        getTime(ll);
    }

    public static void getTime(List<Integer> l) {

        long start = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++) {
            l.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(l.getClass() + " " + (end - start));
    }
}
