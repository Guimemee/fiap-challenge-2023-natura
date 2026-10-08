package br.com.fiap.natura.filas;

public class Empresa {
	
	private String cnpj;
    private String materialUtilizado;
    private String statusDocumentacao;

    public Empresa(String cnpj, String materialUtilizado, String statusDocumentacao) {
        this.cnpj = cnpj;
        this.materialUtilizado = materialUtilizado;
        this.statusDocumentacao = statusDocumentacao;
    }

    public String pegarCnpj() {
        return cnpj;
    }

    public void Cnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String pegarMaterialUtilizado() {
        return materialUtilizado;
    }

    public void MaterialUtilizado(String materialUtilizado) {
        this.materialUtilizado = materialUtilizado;
    }

    public String pegarStatusDocumentacao() {
        return statusDocumentacao;
    }

    public void StatusDocumentacao(String statusDocumentacao) {
        this.statusDocumentacao = statusDocumentacao;
    }

    
    public String String() {
        return "Empresa [CNPJ=" + cnpj + ", material utilizado=" + materialUtilizado + ", Status da Documentação=" + statusDocumentacao + "]";
     		
        }    
     }

