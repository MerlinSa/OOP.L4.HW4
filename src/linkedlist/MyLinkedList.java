package linkedlist;


public class MyLinkedList <E> implements Linked<E>{
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size =0;

    public MyLinkedList() {
       lastNode = new Node<E>(null, firstNode, null); //у lastNode предыдущий эелемент-firsNode,
        // след элемен-та нет, поэтому нал, current элем пока неизвестно-null.
       firstNode = new Node<E>(null, null, lastNode);// у firstNode преды-го элемен нет, поэтому нал, след элемент-lastNode.
        //кажется замкнутый LinkedList.
    }

    @Override
    public void addLast(E elem) {
        Node<E> prev = lastNode; //создали указатель-prev на объект-lastNode,будем обращаться к lastNode по указателю prev.
        prev.setCurrentElem(elem); //задали указателю prev текущий элем.теперь его элем.не нул, а послед-й кот-й нам пришел.и поэтому мы остались без послед.ноды(lastNode).
        lastNode = new Node<>(null, prev, null); //далее создали новую lastNode по значению нул, преды-щий элем-prev. след.элем-та нет-нул.
        prev.setNextElem(lastNode); //задаем предпослд.элементу след.элем-lastNode(пустышку)
        size++;

    }

    @Override
    public void addFirst(E elem) {
        Node<E> zero = firstNode;
        zero.setCurrentElem(elem);
        firstNode = new Node<>(null, null, zero);
        zero.setPrevElem(firstNode);
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
       Node<E> indexA = firstNode.getNextElem(); //берем след.элемент у firstNode,он(indexA) возврщает нам настоящий нулевой индекс
       for (int i = 0; i < counter; i++) {
           indexA = getNextElement(indexA);// здесь вызываем метод(getNextElement(Node<E> current))
           // каждый раз берем след.элем пока i<counter и каждый раз indexA перезапис-ся,
           // пока не получим элемен по индексу.
       }
        return indexA.getCurrentElem(); //возвращаем нужный элемент по индексу, когда цикл завершится.
    }
    private Node<E> getNextElement(Node<E> current) { //метод для получения след.элемента
        return current.getNextElem(); //здесь у current возвращаем метод из класса Node.
    }
}

