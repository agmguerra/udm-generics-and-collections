package br.com.agmg.udemy.dois;

public class GenericMethod {
	
	public <T> void showItem(T t) {
		System.out.println("The item is " + t.toString());
	}

	public <T> T showItemDois(T t) {
		return t;
	}
	
	public <T> void showArray(T[] array) {
		for (T item : array) {
			System.out.println("The item is: " + item.toString());
		}
	}
	
	/**
	 * Permite apenas que objetos que implementem Comparable possa ser passados
	 * Veja que por causa disso (implementação do Comparable) o método compare pode
	 * se chamado.
	 * @param t1
	 * @param t2
	 * @return
	 */
	public <T extends Comparable<T>> T calculateMin(T t1, T t2) {
		if (t1.compareTo(t2) < -1) {
			return t1;
		}
		
		return t2;

	}
}
