package leetcode.easy;

public class DesignHashset {

	public static void main(String[] args) {
		MyHashSet obj = new MyHashSet();
		obj.add(10);
		obj.remove(10);
		boolean param_3 = obj.contains(10);
	}
}

class MyHashSet {
	boolean[] arr;

	public MyHashSet() {
		arr = new boolean[1000001];
	}

	public void add(int key) {
		arr[key] = true;
	}

	public void remove(int key) {
		arr[key] = false;
	}

	public boolean contains(int key) {
		return arr[key];
	}
}
