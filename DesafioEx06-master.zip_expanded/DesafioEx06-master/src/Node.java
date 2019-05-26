
/**
 * A Node structure.
 *
 * @version May 24, 2019.
 * @author Caetano Matheus e thayron .
 */
public class Node <T> {

    public T value;
    public Node link;

    /**
     * Create a new Node.
     */
    public Node() {
        this.value = null;
        this.link = null;
    }

    /**
     * Create a new Node.
     *
     * @param nodeValue - Value to be inserted into the node.
     */
    public Node(T nodeValue) {
        this.value = nodeValue;
    }

    /**
     * Returns the node value.
     *
     * @return - Node value.
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Inserts a new value into the node.
     *
     * @param value - Node value.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the linked node.
     *
     * @return - linked node.
     */
    public Node getLink() {
        return this.link;
    }

    /**
     * Defines a new linked node.
     *
     * @param newLink Node - New node to be linked.
     */
    public void setLink(Node newLink) {
        this.link = newLink;
    }
}