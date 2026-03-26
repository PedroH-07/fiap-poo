package br.com.fiapride.model;

public class Oculos {
    private String armacao;
    private String material;
    private Lente lenteUtilizada;

    public Oculos(String armacao, String material, Lente lenteUtilizada) {
        this.armacao = "Padrao";
        this.material = "A definir";
        this.lenteUtilizada = null;

        this.setArmacao(armacao);
        this.setMaterial(material);
        this.setLenteUtilizada(lenteUtilizada);
    }

    public String getArmacao() {
        return this.armacao;
    }

    public String getMaterial() {
        return this.material;
    }

    public Lente getLenteUtilizada() {
        return this.lenteUtilizada;
    }

    // SETTERS COM REGRAS DE ENCAPSULAMENTO

    public void setArmacao(String armacao) {
        if (armacao == null || armacao.trim().isEmpty()) {
            System.out.println("Erro: Armacao nao pode ser vazia.");
            return;
        }
        this.armacao = armacao.trim();
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            System.out.println("Erro: Material nao pode ser vazio.");
            return;
        }
        this.material = material.trim();
    }

    public void setLenteUtilizada(Lente lenteUtilizada) {
        if (lenteUtilizada == null) {
            System.out.println("Erro: Lente nao pode ser nula.");
            return;
        }
        this.lenteUtilizada = lenteUtilizada;
    }
}