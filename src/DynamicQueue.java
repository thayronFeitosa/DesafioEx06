
/**
 * A dynamic queue structure.
 *
 * @version May 24, 2019.
 * @author Caetano Matheus.
 */
public class DynamicQueue<T> {

    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size;

    /**
     * Create a new dynamic queue.
     */
    public DynamicQueue() {
        this.firstElement = new Node();
        this.lastElement = new Node();
        this.size = 0;
    }

    /**
     * Verifies if the queue is empty.
     *
     * @return boolean - Returns true if the queue is empty.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Returns the queue size.
     *
     * @return int - queue size.
     */
    public int size() {
        return this.size;
    }

    /**
     * Enqueue a new element as the last on queue.
     *
     * @param element - Element to be enqueued.
     */
    public void enqueue(T element) {
        Node<T> newNode = new Node(element);
        if (this.isEmpty()) {
            this.firstElement.setLink(newNode);
            this.lastElement.setLink(newNode);
            this.size++;
            return;
        }

        this.lastElement.getLink().setLink(newNode);
        this.lastElement.setLink(newNode);
        this.size++;
    }

    /**
     * Removes the first element on the queue.
     *
     * @return element - Removed element.
     */
    public T dequeue() {
        if (this.isEmpty()) throw new RuntimeException("queue is empty!");
        Node<T> nodeReturn = this.firstElement.getLink();
        this.firstElement.setLink(nodeReturn.getLink());
        this.size--;
        return nodeReturn.getValue();
    }
}