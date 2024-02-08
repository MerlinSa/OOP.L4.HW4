package linkedlist;

public class Node<E> {
    private E currentElem;
    private Node<E> nextElem;
    private Node<E> prevElem;
    public Node(E currentElem,Node<E> prevElem, Node<E> nextElem) {
        this.currentElem = currentElem;
        this.nextElem = nextElem;
        this.prevElem = prevElem;
    }


    public E getCurrentElem() {
        return currentElem;
    }

    public void setCurrentElem(E currentElem) {
        this.currentElem = currentElem;
    }

    public Node<E> getNextElem() {
        return nextElem;
    }

    public void setNextElem(Node<E> nextElem) {
        this.nextElem = nextElem;
    }

    public Node<E> getPrevElem() {
        return prevElem;
    }

    public void setPrevElem(Node<E> prevElem) {
        this.prevElem = prevElem;
    }
}
