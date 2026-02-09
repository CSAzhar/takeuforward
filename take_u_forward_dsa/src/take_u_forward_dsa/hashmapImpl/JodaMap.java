package take_u_forward_dsa.hashmapImpl;

import java.util.LinkedList;

public class JodaMap<K, V> {
	
	private final int DEFULT_CAPACITY = 4;
	private final float DEFAULT_LAOD_FACTOR = 0.75f;
	private int n;
	private LinkedList<Node> [] members;
	
	private void initiateHashMap(int mapSize) {
		members = new LinkedList[mapSize];
		for(int i= 0; i<mapSize; i++) {
			members[i] = new LinkedList<Node>();
		}
	}
	private int getHashValueIndex(K key) {
		int hash = key.hashCode();
		return (hash & 0x7fffffff) % members.length;
	}
	private int getIndexFromLL(LinkedList<Node> ll, K key) {
		for(int i = 0;  i< ll.size(); i++) {
			if((ll.get(i).key).equals(key)) return i;
		}
		return -1;
	}
	private void rehashMap() {
		n = 0;
		LinkedList<Node> [] oldHashMap = members;
		initiateHashMap(members.length * 2);
		for(int i = 0; i< oldHashMap.length; i++) {
			LinkedList<Node> currentll = oldHashMap[i];
			for(Node n : currentll) {
				put(n.key, n.value);
			}
		}
	}
	public JodaMap() {
		initiateHashMap(DEFULT_CAPACITY);
	}
	private class Node{
		private K key;
		private V value;
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int size() {
		return n;
	}
	public V put(K key, V value) {
		int ai = getHashValueIndex(key);
		LinkedList<Node> currentLinkedList = members[ai];
		int ei = getIndexFromLL(currentLinkedList, key);
		if(ei != -1) {
			V oldValue = currentLinkedList.get(ei).value;
			currentLinkedList.get(ei).value = value;
			return oldValue;
		}else {
			Node newNode = new Node(key, value);
			currentLinkedList.add(newNode);
			n++;
			if(n > members.length * DEFAULT_LAOD_FACTOR) rehashMap();
			return null;
		}	
	}
	public V get(K key) {
		int ai = getHashValueIndex(key);
		LinkedList<Node> ll = members[ai];
		int ei = getIndexFromLL(ll, key);
		if(ei == -1) return null;
		return ll.get(ei).value;
	}
	public V remove(K key) {
		int hi = getHashValueIndex(key);
		LinkedList<Node> ll = members[hi];
		int ai = getIndexFromLL(ll, key);
		if(ai == -1) {
			return null;
		}else {
			V valueOld = ll.get(ai).value;
			ll.remove(ai);
			n--;
			return valueOld;
		}
	}

}
