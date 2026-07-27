import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Add current request timestamp
        queue.add(t);
        
        // Remove requests older than 3000ms from the current time 't'
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        
        // Number of requests in the range [t - 3000, t]
        return queue.size();
    }
}
