package br.com.fiap.natura.filas;

public class FilaEmpresas {
	   private Empresa[] fila;
	    private int inicio;
	    private int fim;

	    public FilaEmpresas(int tamanho) {
	        fila = new Empresa[tamanho];
	        inicio = 0;
	        fim = 0;
	    }

	    public void enfileirar(Empresa empresa) {
	        if (!isFull()) {
	            fila[fim] = empresa;
	            fim = (fim + 1) % fila.length;
	        }
	    }

	    public Empresa desenfileirar() {
	        if (!isEmpty()) {
	            Empresa empresa = fila[inicio];
	            inicio = (inicio + 1) % fila.length;
	            return empresa;
	        }
	        return null;
	    }

	    public boolean isEmpty() {
	        return inicio == fim;
	    }

	    public boolean isFull() {
	        return (fim + 1) % fila.length == inicio;
	    }

	    public int tamanho() {
	        return (fila.length - inicio + fim) % fila.length;
	    }

	    public Empresa buscarEmpresaPorCnpj(String cnpj) {
	        for (int i = inicio; i != fim; i = (i + 1) % fila.length) {
	            Empresa empresa = fila[i];
	            if (empresa.pegarCnpj().equals(cnpj)) {
	                return empresa;
	            }
	        }
	        return null;
	    }
	    
	    public boolean estaVazia() {
	        return inicio == fim;
	    }
	    public void inicializa() {
	        inicio = 0;
	        fim = 0;
	    }
	     public Empresa peek() {
	            if (!isEmpty()) {
	                return fila[inicio];
	            }
	            return null;
	        }
	    }