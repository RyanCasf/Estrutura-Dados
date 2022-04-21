package br.com.ryan.lista;

public class Teste {
	public static void main(String[] args) {
		ListGeneric lista = new Lista(10);
		lista.add("Elemento 1", "Elemento 2", "Elemento 3");

		System.out.println(lista.toString() + " | Tam.: " + lista.size());
	}
}