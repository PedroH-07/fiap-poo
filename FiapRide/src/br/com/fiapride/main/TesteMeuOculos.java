package br.com.fiapride.main;

import br.com.fiapride.model.Oculos;

public class TesteMeuOculos {
    public static void main(String[] args) {
        Oculos meuOculos = new Oculos();
        Oculos reservaOculos = new Oculos();

        System.out.println("--- Estado inicial dos oculos ---");
        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial() + " | Grau: " + meuOculos.getGrau());

        System.out.println("\n--- Testando setters com valores VALIDOS ---");
        meuOculos.setArmacao("Redondo");
        meuOculos.setMaterial("Acrilico");
        meuOculos.setGrau(1.25);

        reservaOculos.setArmacao("Retangular");
        reservaOculos.setMaterial("Aco");
        reservaOculos.setGrau(2.0);

        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial() + " | Grau: " + meuOculos.getGrau());
        System.out.println("Reserva: " + reservaOculos.getArmacao() + " | Material: "
                + reservaOculos.getMaterial() + " | Grau: " + reservaOculos.getGrau());

        System.out.println("\n--- Testando setters com valores INVALIDOS ---");
        System.out.println("Tentando setArmacao com valor vazio:");
        meuOculos.setArmacao("   ");
        System.out.println("Armacao apos tentativa: " + meuOculos.getArmacao());

        System.out.println("\nTentando setMaterial com null:");
        meuOculos.setMaterial("");
        System.out.println("Material apos tentativa: " + meuOculos.getMaterial());

        System.out.println("\nTentando setGrau com valor negativo (REGRA ESPECIAL):");
        meuOculos.setGrau(-3.0);
        System.out.println("Grau apos tentativa: " + meuOculos.getGrau());

        System.out.println("\nTentando setGrau com valor acima de 10 (REGRA ESPECIAL):");
        meuOculos.setGrau(15.0);
        System.out.println("Grau apos tentativa: " + meuOculos.getGrau());

        System.out.println("\n--- Estado final dos oculos (nao deve mudar com entradas invalidas) ---");
        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial() + " | Grau: " + meuOculos.getGrau());

        // TENTATIVA DE BURLAR O SISTEMA
        // meuOculos.grau = 999.0; // vai exibir erro vermelho
    }
}
