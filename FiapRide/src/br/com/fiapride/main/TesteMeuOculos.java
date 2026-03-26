package br.com.fiapride.main;

import br.com.fiapride.model.Oculos;
import br.com.fiapride.model.Lente;

public class TesteMeuOculos {
    public static void main(String[] args) {
        // Criando as lentes para os óculos
        Lente lentePrincipal = new Lente(1.25, "Monofocal");
        Lente lenteReserva = new Lente(2.0, "Bifocal");

        // Criando os óculos com as respectivas lentes
        Oculos meuOculos = new Oculos("Redondo", "Acrilico", lentePrincipal);
        Oculos reservaOculos = new Oculos("Retangular", "Aco", lenteReserva);

        System.out.println("--- Estado inicial dos oculos ---");
        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial());
        System.out.println("Lente utilizada: Grau " + meuOculos.getLenteUtilizada().getGrau() + 
                " | Tipo: " + meuOculos.getLenteUtilizada().getTipo());

        System.out.println("\nReserva: " + reservaOculos.getArmacao() + " | Material: "
                + reservaOculos.getMaterial());
        System.out.println("Lente utilizada: Grau " + reservaOculos.getLenteUtilizada().getGrau() + 
                " | Tipo: " + reservaOculos.getLenteUtilizada().getTipo());

        System.out.println("\n--- Testando setters com valores VALIDOS ---");
        meuOculos.setArmacao("Redondo");
        meuOculos.setMaterial("Acrilico");

        reservaOculos.setArmacao("Retangular");
        reservaOculos.setMaterial("Aco");

        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial());
        System.out.println("Reserva: " + reservaOculos.getArmacao() + " | Material: "
                + reservaOculos.getMaterial());

        System.out.println("\n--- Testando setters com valores INVALIDOS ---");
        System.out.println("Tentando setArmacao com valor vazio:");
        meuOculos.setArmacao("   ");
        System.out.println("Armacao apos tentativa: " + meuOculos.getArmacao());

        System.out.println("\nTentando setMaterial com valor vazio:");
        meuOculos.setMaterial("");
        System.out.println("Material apos tentativa: " + meuOculos.getMaterial());

        System.out.println("\nTentando setGrau na lente com valor negativo (REGRA ESPECIAL):");
        meuOculos.getLenteUtilizada().setGrau(-3.0);
        System.out.println("Grau apos tentativa: " + meuOculos.getLenteUtilizada().getGrau());

        System.out.println("\nTentando setGrau na lente com valor acima de 10 (REGRA ESPECIAL):");
        meuOculos.getLenteUtilizada().setGrau(15.0);
        System.out.println("Grau apos tentativa: " + meuOculos.getLenteUtilizada().getGrau());

        System.out.println("\n--- Estado final dos oculos (nao deve mudar com entradas invalidas) ---");
        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial());
        System.out.println("Lente associada: Grau " + meuOculos.getLenteUtilizada().getGrau() + 
                " | Tipo: " + meuOculos.getLenteUtilizada().getTipo());

        // TENTATIVA DE BURLAR O SISTEMA
        // meuOculos.grau = 999.0; // vai exibir erro vermelho
    }
}




