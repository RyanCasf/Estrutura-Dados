package br.com.ryan.lista;

interface ListGeneric {
    void add(String... values);
    int size();
    void out();
    String get();
    boolean isThere();
    void add(int index, String value);
    // void addCapcacidade();
    boolean remove(int index);
    boolean remove(String value);
}