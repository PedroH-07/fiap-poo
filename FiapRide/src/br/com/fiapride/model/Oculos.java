package br.com.fiapride.model;

public class Oculos {
    private String armacao;
    private double grau;
    private String material;

    public Oculos(String armacao, double grau, String material) {
        this.armacao = "Padrao";
        this.grau = 0.0;
        this.material = "A definir";

        this.setArmacao(armacao);
        this.setGrau(grau);
        this.setMaterial(material);
    }

    public String getArmacao() {
        return this.armacao;
    }

    public double getGrau() {
        return this.grau;
    }

    public String getMaterial() {
        return this.material;
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

    // REGRA ESPECIAL: O grau nao pode ser negativo ou maior que 10
    public void setGrau(double grau) {
        if (grau < 0 || grau > 10) {
            System.out.println("Erro: Grau invalido. Deve estar entre 0 e 10.");
            return;
        }
        this.grau = grau;
    }

    public boolean alterarArmacao(String novaArmacao) {
        if (novaArmacao == null || novaArmacao.trim().isEmpty()) {
            System.out.println("Armacao invalida. Informe um valor nao vazio.");
            return false;
        }
        this.armacao = novaArmacao.trim();
        return true;
    }

    public boolean alterarGrau(double novoGrau) {
        if (novoGrau < 0 || novoGrau > 10) {
            System.out.println("Grau invalido. Informe um valor entre 0 e 10.");
            return false;
        }
        this.grau = novoGrau;
        return true;
    }

    public boolean alterarMaterial(String novoMaterial) {
        if (novoMaterial == null || novoMaterial.trim().isEmpty()) {
            System.out.println("Material invalido. Informe um valor nao vazio.");
            return false;
        }
        this.material = novoMaterial.trim();
        return true;
    }
}