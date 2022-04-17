package br.com.ryan.lista;

public class Lista implements ListGeneric {
    private String[] vetor;
    private int size = 0;
    private int sizeMax = 0;

    Lista(int sizeMax) {
        vetor = new String[sizeMax];
        this.sizeMax =  sizeMax;
    }

    @Override
    public void add(String... values) {
        return;
    }

    @Override
    public int size() {
        return size;
    }
}