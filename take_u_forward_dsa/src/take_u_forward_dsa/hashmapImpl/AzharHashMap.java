package take_u_forward_dsa.hashmapImpl;

import java.util.LinkedList;

public class AzharHashMap<K, V> {
	private static final int DEFAULT_CAPACITY = 4;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;
	private LinkedList<Node>[] buckets;
	private int n;
	private class Node{
		K key;
		V value;
		Node(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
	private void initBucket(int N) {
		n = 0;
		buckets = new LinkedList[N];
		for(int i = 0; i<buckets.length; i++) {
			buckets[i] = new LinkedList<Node>();
		}
	}
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
//		return  (int)(hashCode) % buckets.length;
		return ( hashCode & 0x7fffffff) % buckets.length;
	}
	private int getIndexInLl(LinkedList<Node> ll, K key) {
		for(int i = 0; i< ll.size(); i++) {
			if(ll.get(i).key.equals(key)) return i;
		}
		return -1;
	}
	private void rehashMap() {
		LinkedList<Node>[] oldBucket = buckets;
		initBucket( oldBucket.length * 2);
		for(LinkedList<Node> ll : oldBucket) {
			for(Node n : ll) {
				put(n.key, n.value);
			}
		}
	}
	
	public AzharHashMap() {
		initBucket(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return n;
	}
	public V put(K key, V value) {
		if(key == null) {
			throw new IllegalArgumentException("Null value not allowed");
		}
		int bi = getBucketIndex(key);
		LinkedList<Node> currentBucket = buckets[bi];
		int ei = getIndexInLl(currentBucket, key);
		if(ei != -1) {
			V oldValue = currentBucket.get(ei).value;
			currentBucket.get(ei).value = value;
			return oldValue;
		}else {
			currentBucket.add(new Node(key, value));
			n++;
			if(n > buckets.length * DEFAULT_LOAD_FACTOR) rehashMap();
			return null;
		}
	}
	public V get(K key) {
		int bi = getBucketIndex(key);
		LinkedList<Node> currentLl = buckets[bi];
		int ei = getIndexInLl(currentLl, key);
		if(ei != -1) {
			return currentLl.get(ei).value;
		}
		return null;
	}
	public V remove(K key) {
		int bi = getBucketIndex(key);
		LinkedList<Node> currentBucket = buckets[bi];
		int ei = getIndexInLl(currentBucket, key);
		if(ei != -1) {
			V value = currentBucket.get(ei).value;
			currentBucket.remove(ei);
			n--;
			return value;
		}
		return null;
	}
	public boolean containtKey(K key) {
		int bi = getBucketIndex(key);
		LinkedList<Node> currentBucket = buckets[bi];
		int ei = getIndexInLl(currentBucket, key);
		return ei == -1 ? false: true;
	}
	public boolean isEmpty() {
		return n == 0 ? true: false;
	}
	public void clear() {
		initBucket(DEFAULT_CAPACITY);
	}
	
	//====================================================
	public static void main(String[] args) {
		AzharHashMap<String, Integer> map = new AzharHashMap<>();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.containtKey("a"));
		map.put("a", 1);
		System.out.println(map.containtKey("a"));
		System.out.println(map.size());
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		map.put("g", 7);
		map.put("h", 8);
		map.put("i", 9);
		System.out.println(map.size());
		System.out.println(map.remove("g"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.put(null, 33);
	}
	
}








