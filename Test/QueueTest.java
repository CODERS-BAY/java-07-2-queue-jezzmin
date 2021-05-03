import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test

    public void testSize () {
        Queues myQueue = new Queues();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        Assertions.assertEquals(3, myQueue.size());
    }

    @Test
    public void testSizeZero () {
        Queues myQueue = new Queues();

        Assertions.assertEquals(0, myQueue.size());
    }

    @Test
    public void testDequeue () {
        Queues myQueue = new Queues();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.dequeue();

        Assertions.assertEquals(4, myQueue.size());
    }

    @Test
    public  void testMoreDequeue () {
        Queues myQueue = new Queues();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.dequeue();
        myQueue.dequeue();

        Assertions.assertEquals(0, myQueue.size());
    }

    @Test
    public void dequeueArray () {
        Queues myQueue = new Queues();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueue.dequeue(2);

        Assertions.assertEquals(2,myQueue.size());
    }

    @Test
    public void dequeueArrayZero () {
        Queues myQueue = new Queues();

        myQueue.enqueue(1);
        myQueue.enqueue(2);

        myQueue.dequeue(2);
        Assertions.assertEquals(0, myQueue.size());
    }

    @Test
    public void exceptionTest () {
        Queues myQueue = new Queues();
        Assertions.assertThrows(QueueTooSmallException.class, () -> {
            (new Queues()).dequeue();
        });
    }
}
