import java.util.ArrayList;
import java.util.List;

public class Queues {


    private List<Integer> queue = new ArrayList<>();

    public void enqueue(int newElement) {
        queue.add(newElement);
    }

    public int size() {
        return queue.size();
    }

    public int dequeue() {
        if (queue.size() == 0) {
            throw new QueueTooSmallException();
        }

        int remove = queue.get(0);
        queue.remove(0);

        return remove;
    }

    public int[] dequeue(int n) {

        int [] toReturn = new int[queue.size()];

        for (int i = 0; i < n; i++) {
            toReturn[i] = dequeue();
        }


        return toReturn;
    }
}
