import com.google.common.base.Stopwatch;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;

public class TwoSum {

    private HashMap<Long, Long> map;
    private ArrayList<Long> Ts;
    private long result = 0L;


    public TwoSum() {
        Ts = newArrayList();
        for(long i = -10000; i < 10001; i++){
            Ts.add(i);
        }

        Scanner scan = new Scanner(System.in);
        map = new HashMap<>();
        while (scan.hasNextLong()) {
            long a = scan.nextLong();
            if (!map.containsKey(a)) {
                map.put(a, a);
            }
        }
    }

    private long count(){
        //long c = 0L;
        for (Long T : Ts) {
            long t = T;
            for (Long x : map.values()) {
                long y = t - x;
                if (map.containsValue(y) && y != x) {
                    result++;
                }
                //System.out.println(c++);
            }
        }
        return result / 2;
    }

    public static void main(String [] args) {
        TwoSum s = new TwoSum();
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(s.count());
        stopwatch.stop();
        System.out.println("time:" + stopwatch);

    }
}