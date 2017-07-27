
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/*
Общий список
*/

public class Solution implements List<Long> {
	private ArrayList<Long> original = new ArrayList<Long>();

	public static synchronized void main(String[] args) {

	}

	public synchronized void trimToSize() {
		original.trimToSize();
	}

	public synchronized void ensureCapacity(int i) {
		original.ensureCapacity(i);
	}

	@Override
	public synchronized int size() {
		return original.size();
	}

	@Override
	public synchronized boolean isEmpty() {
		return original.isEmpty();
	}

	@Override
	public synchronized boolean contains(Object o) {
		return original.contains(o);
	}

	@Override
	public synchronized int indexOf(Object o) {
		return original.indexOf(o);
	}

	@Override
	public synchronized int lastIndexOf(Object o) {
		return original.lastIndexOf(o);
	}

	@Override
	public synchronized Object clone() {
		return original.clone();
	}

	@Override
	public synchronized Object[] toArray() {
		return original.toArray();
	}

	@Override
	public synchronized <T> T[] toArray(T[] ts) {
		return original.toArray(ts);
	}

	@Override
	public synchronized Long get(int i) {
		return original.get(i);
	}

	@Override
	public synchronized Long set(int i, Long aLong) {
		return original.set(i, aLong);
	}

	@Override
	public synchronized boolean add(Long aLong) {
		return original.add(aLong);
	}

	@Override
	public synchronized void add(int i, Long aLong) {
		original.add(i, aLong);
	}

	@Override
	public synchronized Long remove(int i) {
		return original.remove(i);
	}

	@Override
	public synchronized boolean remove(Object o) {
		return original.remove(o);
	}

	@Override
	public synchronized void clear() {
		original.clear();
	}

	@Override
	public synchronized boolean addAll(Collection<? extends Long> collection) {
		return original.addAll(collection);
	}

	@Override
	public synchronized boolean addAll(int i, Collection<? extends Long> collection) {
		return original.addAll(i, collection);
	}

	@Override
	public synchronized boolean removeAll(Collection<?> collection) {
		return original.removeAll(collection);
	}

	@Override
	public synchronized boolean retainAll(Collection<?> collection) {
		return original.retainAll(collection);
	}

	@Override
	public synchronized ListIterator<Long> listIterator(int i) {
		return original.listIterator(i);
	}

	@Override
	public synchronized ListIterator<Long> listIterator() {
		return original.listIterator();
	}

	@Override
	public synchronized Iterator<Long> iterator() {
		return original.iterator();
	}

	@Override
	public synchronized List<Long> subList(int i, int i1) {
		return original.subList(i, i1);
	}

	@Override
	public synchronized void forEach(Consumer<? super Long> consumer) {
		original.forEach(consumer);
	}

	@Override
	public synchronized Spliterator<Long> spliterator() {
		return original.spliterator();
	}

	@Override
	public synchronized boolean removeIf(Predicate<? super Long> predicate) {
		return original.removeIf(predicate);
	}

	@Override
	public synchronized void replaceAll(UnaryOperator<Long> unaryOperator) {
		original.replaceAll(unaryOperator);
	}

	@Override
	public synchronized void sort(Comparator<? super Long> comparator) {
		original.sort(comparator);
	}

	@Override
	public synchronized boolean containsAll(Collection<?> collection) {
		return original.containsAll(collection);
	}

	@Override
	public synchronized String toString() {
		return original.toString();
	}

	@Override
	public synchronized Stream<Long> stream() {
		return original.stream();
	}

	@Override
	public synchronized Stream<Long> parallelStream() {
		return original.parallelStream();
	}
}