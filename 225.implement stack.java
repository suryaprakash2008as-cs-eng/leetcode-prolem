import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        // Rotate queue so the newest element is at the front
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
    // Removes the element on top of the stack and returns it.
    public int pop() {
        return queue.remove();
    }
    
    // Get the top element.
    public int top() {
        return queue.peek();
    }
    
    // Returns whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
