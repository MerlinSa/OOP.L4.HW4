


LinkedList - двунаправленный список (цепочка), хранит элементы в объектах Node<E> (узлы), у которых есть ссылки на предыдущий и следующий элементы (используют, чтобы добавлять/удалять элементы. )

+ быстрая вставка и удаление в середину списка (переписать next и previous и всё);

- долгий поиск в середине (нужно перебрать все элементы);

LinkedList — класс, реализующий два интерфейса — List и Deque. Это обеспечивает возможность создания двунаправленной очереди из любых (в том числе и null) элементов. Каждый объект, помещенный в связанный 
список, является узлом (нодом). Каждый узел содержит элемент, ссылку на предыдущий и следующий узел. 
Фактически связанный список состоит из последовательности узлов, каждый из которых предназначен для хранения объекта определенного при создании типа.

LinkedList<Integer> numbers = new LinkedList<>();
Данный код создает объект класса LinkedList и сохраняет его в ссылке numbers. Созданный объект предназначен для хранения целых чисел (Integer). Пока этот объект пуст.

Класс LinkedList содержит три поля:
int size = 0;
Node<E> first; первый узел
Node<E> last; последний узел

Для установки ссылок на предыдущий и следующий элементы LinkedList использует объекты своего вложенного класса Node:
public class Node<E> {
    private E currentElem;
    private Node<E> nextElem;
    private Node<E> prevElem;
    public Node(E currentElem,Node<E> prevElem, Node<E> nextElem) {
        this.currentElem = currentElem;
        this.nextElem = nextElem;
        this.prevElem = prevElem;
    }
