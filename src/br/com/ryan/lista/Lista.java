package br.com.ryan.lista;

public class Lista implements ListGeneric {
	private String[] vetor;
	private int index = 0;

	Lista(int size) {
		this.vetor = new String[size];
		index = 0;
	}

	@Override
	public void add(String... values) {
		if (values == null) {
			return;
		}

		for (String value : values) {
			for (int i = index; i < vetor.length; i++) {
				if (vetor[i] == null) {
					vetor[i] = value;
					index++;
					break;
				}
			}
		}
	}

	@Override
	public int size() {
		return vetor.length;
	}

	@Override
	public void out() {
		return;
	}

	@Override
	public String get() {
		return null;
	}

	@Override
	public boolean isThere() {
		return false;
	}

	@Override
	public void add(int index, String value) {
		return;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public boolean remove(String value) {
		return false;
	}
	
	@Override
	public String toString() {
		if (index == 0)
			return "";
		
		StringBuilder sb = new StringBuilder("[");
		
		for (String elemento : vetor) {
			if (elemento != null)
				sb.append(", " + elemento);
		}
		sb.append("]");
		
		return sb.toString().replace("[,", "[");
	}
}