package br.com.agmg.udemy.dois;

public class App {

	
	
	public static void main(String[] args) {
		GenericMethod gen = new GenericMethod();
		
		gen.showItem("Teste");
		gen.showItem('R');
		gen.showItem(15);
		gen.showItem(35.2);

		System.out.println("The returned item is: " + gen.showItemDois("Teste"));
		System.out.println("The returned item is: " + gen.showItemDois(10));
		
		Integer[] array = { 1, 2, 4, 6, 8};
		gen.showArray(array);
		
	}

}
