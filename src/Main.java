import java.util.HashMap;
import java.util.Map;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] A = {0, 1};
        int[] B = {0, 1};
        for (int i : A) {
            for (int j : B) {
                map.put((i + j), map.getOrDefault((i + j), 0) + 1);
            }
        }
    }
}
