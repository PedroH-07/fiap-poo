package br.com.fiapride.model;

public class Lente {
    private double grau;
    private String tipo;

    public Lente(double grau, String tipo) {
        this.grau = 0.0;
        this.tipo = "Padrao";

        this.setGrau(grau);
        this.setTipo(tipo);
    }

    public double getGrau() {
        return this.grau;
    }

    public String getTipo() {
        return this.tipo;
    }

    // SETTERS COM REGRAS DE ENCAPSULAMENTO

    public void setGrau(double grau) {
        if (grau < 0 || grau > 10) {
            System.out.println("Erro: Grau invalido. Deve estar entre 0 e 10.");
            return;
        }
        this.grau = grau;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("Erro: Tipo da lente nao pode ser vazio.");
            return;
        }
        this.tipo = tipo.trim();
    }
}

