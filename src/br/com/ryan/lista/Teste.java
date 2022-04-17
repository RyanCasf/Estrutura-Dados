package br.com.ryan.lista;

public class Teste {
    public static void main(String[] args) {
        ListGeneric lista = new Lista(10);
        lista.add("Ryan Castro Ferreira");

        System.out.println(lista.toString()+" | Tam.: "+lista.size());
    }
}