import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class VectorLib extends Vector {

    public VectorLib(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public VectorLib(int initialCapacity) {
        super(initialCapacity);
    }

    public VectorLib() {
        super();
    }

    public VectorLib(Collection c) {
        super(c);
    }

    @Override
    public synchronized void copyInto(Object[] anArray) {
        super.copyInto(anArray);
    }

    @Override
    public synchronized void trimToSize() {
        super.trimToSize();
    }

    @Override
    public synchronized void ensureCapacity(int minCapacity) {
        super.ensureCapacity(minCapacity);
    }

    @Override
    public synchronized void setSize(int newSize) {
        super.setSize(newSize);
    }

    @Override
    public synchronized int capacity() {
        return super.capacity();
    }

    @Override
    public synchronized int size() {
        return super.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public Enumeration elements() {
        return super.elements();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public synchronized int indexOf(Object o, int index) {
        return super.indexOf(o, index);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return super.lastIndexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o, int index) {
        return super.lastIndexOf(o, index);
    }

    @Override
    public synchronized Object elementAt(int index) {
        return super.elementAt(index);
    }

    @Override
    public synchronized Object firstElement() {
        return super.firstElement();
    }

    @Override
    public synchronized Object lastElement() {
        return super.lastElement();
    }

    @Override
    public synchronized void setElementAt(Object obj, int index) {
        super.setElementAt(obj, index);
    }

    @Override
    public synchronized void removeElementAt(int index) {
        super.removeElementAt(index);
    }

    @Override
    public synchronized void insertElementAt(Object obj, int index) {
        super.insertElementAt(obj, index);
    }

    @Override
    public synchronized void addElement(Object obj) {
        super.addElement(obj);
    }

    @Override
    public synchronized boolean removeElement(Object obj) {
        return super.removeElement(obj);
    }

    @Override
    public synchronized void removeAllElements() {
        super.removeAllElements();
    }

    @Override
    public synchronized Object clone() {
        return super.clone();
    }

    @Override
    public synchronized Object[] toArray() {
        return super.toArray();
    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        return super.toArray(a);
    }

    @Override
    public synchronized Object get(int index) {
        return super.get(index);
    }

    @Override
    public synchronized Object set(int index, Object element) {
        return super.set(index, element);
    }

    @Override
    public synchronized boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public synchronized Object remove(int index) {
        return super.remove(index);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return super.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        return super.addAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return super.retainAll(c);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return super.removeIf(filter);
    }

    @Override
    public synchronized boolean addAll(int index, Collection c) {
        return super.addAll(index, c);
    }

    @Override
    public synchronized boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public synchronized int hashCode() {
        return super.hashCode();
    }

    @Override
    public synchronized String toString() {
        return super.toString();
    }

    @Override
    public synchronized List subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override
    protected synchronized void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public synchronized ListIterator listIterator(int index) {
        return super.listIterator(index);
    }

    @Override
    public synchronized ListIterator listIterator() {
        return super.listIterator();
    }

    @Override
    public synchronized Iterator iterator() {
        return super.iterator();
    }

    @Override
    public synchronized void forEach(Consumer action) {
        super.forEach(action);
    }

    @Override
    public synchronized void replaceAll(UnaryOperator operator) {
        super.replaceAll(operator);
    }

    @Override
    public synchronized void sort(Comparator c) {
        super.sort(c);
    }

    @Override
    public Spliterator spliterator() {
        return super.spliterator();
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}