package laba7;


import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Dec extends ArrayDeque<String> {

    @Override
    public void addFirst(String s) {
        super.addFirst(s);
    }

    @Override
    public void addLast(String s) {
        super.addLast(s);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return super.addAll(c);
    }

    @Override
    public boolean offerFirst(String s) {
        return super.offerFirst(s);
    }

    @Override
    public boolean offerLast(String s) {
        return super.offerLast(s);
    }

    @Override
    public String removeFirst() {
        return super.removeFirst();
    }

    @Override
    public String removeLast() {
        return super.removeLast();
    }

    @Override
    public String pollFirst() {
        return super.pollFirst();
    }

    @Override
    public String pollLast() {
        return super.pollLast();
    }

    @Override
    public String getFirst() {
        return super.getFirst();
    }

    @Override
    public String getLast() {
        return super.getLast();
    }

    @Override
    public String peekFirst() {
        return super.peekFirst();
    }

    @Override
    public String peekLast() {
        return super.peekLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return super.removeFirstOccurrence(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return super.removeLastOccurrence(o);
    }

    @Override
    public boolean add(String s) {
        return super.add(s);
    }

    @Override
    public boolean offer(String s) {
        return super.offer(s);
    }

    @Override
    public String remove() {
        return super.remove();
    }

    @Override
    public String poll() {
        return super.poll();
    }

    @Override
    public String element() {
        return super.element();
    }

    @Override
    public String peek() {
        return super.peek();
    }

    @Override
    public void push(String s) {
        super.push(s);
    }

    @Override
    public String pop() {
        return super.pop();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public Iterator<String> iterator() {
        return super.iterator();
    }

    @Override
    public Iterator<String> descendingIterator() {
        return super.descendingIterator();
    }

    @Override
    public Spliterator<String> spliterator() {
        return super.spliterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        super.forEach(action);
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter) {
        return super.removeIf(filter);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return super.retainAll(c);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return super.toArray(a);
    }

    @Override
    public ArrayDeque<String> clone() {
        return super.clone();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return super.containsAll(c);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

    @Override
    public Stream<String> stream() {
        return null;
    }

    @Override
    public Stream<String> parallelStream() {
        return null;
    }
}
