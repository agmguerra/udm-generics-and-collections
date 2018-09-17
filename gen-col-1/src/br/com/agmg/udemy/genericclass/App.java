package br.com.agmg.udemy.genericclass;

class Store<T> {
	private T item;
	
	public void setStoreItem(T item) {
		this.item = item;
	}
	
	public T getStoreItem() {
		return item;
	}

	@Override
	public String toString() {
		return "" + item.toString();
	}
	
	
}

class HashTable<K, V> {
	private K key;
	private V value;
	
	public HashTable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		
		return key.toString() + "-" + value.toString();
	}
	
	
}

public class App {
	
	public static void main(String[] args) {

		Store<String> stringStore = new Store<String>();
		stringStore.setStoreItem("teste");
		System.out.println(stringStore.toString());
		
		Store<Integer> integerStore = new Store<>();
		integerStore.setStoreItem(25);
		System.out.println(integerStore.toString());
		
		HashTable<String, Integer> hashTable = new HashTable<>("Hello World!", 25);
		System.out.println(hashTable.toString());
		
		
	}

}
