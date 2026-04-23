package br.com.fiapride.model;

public class OculosDeSol extends Oculos {
    private String nivelProtecaoUv;

    public OculosDeSol(String armacao, String material, Lente lenteUtilizada, String nivelProtecaoUv) {
        super(armacao, material, lenteUtilizada);
        this.nivelProtecaoUv = "UV400";
        this.setNivelProtecaoUv(nivelProtecaoUv);
    }

    public String getNivelProtecaoUv() {
        return this.nivelProtecaoUv;
    }

    public void setNivelProtecaoUv(String nivelProtecaoUv) {
        if (nivelProtecaoUv == null || nivelProtecaoUv.trim().isEmpty()) {
            System.out.println("Erro: Nivel de protecao UV nao pode ser vazio.");
            return;
        }
        this.nivelProtecaoUv = nivelProtecaoUv.trim();
    }

    @Override
    public String descreverUso() {
        return "Uso para protecao solar: filtro " + this.nivelProtecaoUv
                + " com lente " + this.getLenteUtilizada().getTipo() + ".";
    }
}

