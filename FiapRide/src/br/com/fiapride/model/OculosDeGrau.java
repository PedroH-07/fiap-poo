package br.com.fiapride.model;

public class OculosDeGrau extends Oculos {
    private double distanciaPupilar;

    public OculosDeGrau(String armacao, String material, Lente lenteUtilizada, double distanciaPupilar) {
        super(armacao, material, lenteUtilizada);
        this.distanciaPupilar = 60.0;
        this.setDistanciaPupilar(distanciaPupilar);
    }

    public double getDistanciaPupilar() {
        return this.distanciaPupilar;
    }

    public void setDistanciaPupilar(double distanciaPupilar) {
        if (distanciaPupilar < 45.0 || distanciaPupilar > 80.0) {
            System.out.println("Erro: Distancia pupilar invalida. Deve estar entre 45 e 80 mm.");
            return;
        }
        this.distanciaPupilar = distanciaPupilar;
    }
}

