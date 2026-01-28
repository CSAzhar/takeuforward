package take_u_forward_dsa.hashmapImpl;

import java.util.LinkedList;

public class MyHashMap<K, V>{
	private static final int DEFAULT_CAPACITY = 4;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;
	
	private class Node{
		K key;
		V value;
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private int n;
	private LinkedList<Node>[] buckets;
	
	private void initBucket(int N) {
		buckets = new LinkedList[N];
		for(int i = 0; i<buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	private int hashFunction(K key) {
		return ( Math.abs(key.hashCode()) ) % buckets.length;
	}
	private int getNodeIndex(LinkedList<Node> ll, K key) {
		if(ll.size() == 0) return -1;
		for(int i = 0; i< ll.size(); i++) {
			if(ll.get(i).key == key) return i;
		}
		return -1;
	}
	public MyHashMap() {
		initBucket(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return n;
	}
	public void put(K key, V value) {
		int bi = hashFunction(key);
		LinkedList<Node> currentBucket = buckets[bi];
		int nodeIndex = getNodeIndex(currentBucket, key);
		if(nodeIndex != -1) {
			currentBucket.get(nodeIndex).value = value;
		}else {
			currentBucket.add(new Node(key, value));
			n++;
		}
		
	}
	public V get(K key) {
		int bi = hashFunction(key);
		LinkedList<Node> ll = buckets[bi];
		int ni = getNodeIndex(ll, key);
		if(ni != -1) return ll.get(ni).value;
		return null;
	}
	public V remove(K key) {
		int bi = hashFunction(key);
		LinkedList<Node> ll = buckets[bi];
		int ni = getNodeIndex(ll, key);
		if(ni != -1) {
			Node cn = ll.get(ni);
			ll.remove(ni);
			n--;
			return cn.value;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		MyHashMap<String, Integer> map = new MyHashMap<>();
		map.put("azhar", 100);
		map.put("ali", 200);
		System.out.println(map.size());
		System.out.println(map.get("azhar"));
		System.out.println(map.remove("azhar"));
		System.out.println(map.get("azhar"));
		System.out.println(map.size());
	}
	
}
