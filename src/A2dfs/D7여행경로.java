package A2dfs;

import java.util.*;

public class D7여행경로 {
    static Map<String, PriorityQueue<String>> grap = new HashMap<>();

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        for (String[] ticket : tickets) {
            String start = ticket[0];
            if (!grap.containsKey(start)) {
                grap.put(start, new PriorityQueue<>());
            }
            grap.get(start).add(ticket[1]);
        }

        List<String> answer = new ArrayList<>();
        dfs("ICN", answer);
        System.out.println(answer);
    }

    private static void dfs(String start, List<String> list) {
        while (grap.containsKey(start) && !grap.get(start).isEmpty()) {
            dfs(grap.get(start).poll(), list);
        }
        list.addFirst(start);
    }
}
