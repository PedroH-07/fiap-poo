package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.Oculos;
import br.com.fiapride.model.Lente;
import br.com.fiapride.model.OculosDeGrau;
import br.com.fiapride.model.OculosDeSol;

public class TesteMeuOculos {
    public static void main(String[] args) {
        // Criando as lentes para os oculos
        Lente lentePrincipal = new Lente(1.25, "Monofocal");
        Lente lenteReserva = new Lente(2.0, "Bifocal");
        Lente lenteSolar = new Lente(0.0, "Solar");

        // Classe base
        Oculos meuOculos = new Oculos("Redondo", "Acrilico", lentePrincipal);
        Oculos reservaOculos = new Oculos("Retangular", "Aco", lenteReserva);

        // Subclasses com atributos exclusivos
        OculosDeGrau oculosDeGrau = new OculosDeGrau("Quadrado", "Titanio", lentePrincipal, 63.5);
        OculosDeSol oculosDeSol = new OculosDeSol("Aviador", "Metal", lenteSolar, "UV400");

        List<Oculos> colecaoDeOculos = new ArrayList<>();
        colecaoDeOculos.add(meuOculos);
        colecaoDeOculos.add(reservaOculos);
        colecaoDeOculos.add(oculosDeGrau);
        colecaoDeOculos.add(oculosDeSol);

        System.out.println("--- Estado inicial dos oculos ---");
        System.out.println("Meu oculos: " + meuOculos.getArmacao() + " | Material: "
                + meuOculos.getMaterial());
        System.out.println("Lente utilizada: Grau " + meuOculos.getLenteUtilizada().getGrau() + 
                " | Tipo: " + meuOculos.getLenteUtilizada().getTipo());

        System.out.println("\nReserva: " + reservaOculos.getArmacao() + " | Material: "
                + reservaOculos.getMaterial());
        System.out.println("Lente utilizada: Grau " + reservaOculos.getLenteUtilizada().getGrau() + 
                " | Tipo: " + reservaOculos.getLenteUtilizada().getTipo());

        System.out.println("\n--- Testando subclasses com extends e super() ---");
        System.out.println("Oculos de grau: " + oculosDeGrau.getArmacao() + " | Material: "
                + oculosDeGrau.getMaterial() + " | Distancia pupilar: " + oculosDeGrau.getDistanciaPupilar() + " mm");
        System.out.println("Oculos de sol: " + oculosDeSol.getArmacao() + " | Material: "
                + oculosDeSol.getMaterial() + " | Protecao: " + oculosDeSol.getNivelProtecaoUv());

        System.out.println("\n--- Testando setters exclusivos das filhas ---");
        oculosDeGrau.setDistanciaPupilar(61.0);
        oculosDeSol.setNivelProtecaoUv("UV380");
        System.out.println("Distancia pupilar atualizada: " + oculosDeGrau.getDistanciaPupilar() + " mm");
        System.out.println("Protecao UV atualizada: " + oculosDeSol.getNivelProtecaoUv());

        System.out.println("\n--- Tentando valores invalidos nas filhas ---");
        oculosDeGrau.setDistanciaPupilar(90.0);
        oculosDeSol.setNivelProtecaoUv("   ");
        System.out.println("Distancia pupilar apos tentativa invalida: " + oculosDeGrau.getDistanciaPupilar() + " mm");
        System.out.println("Protecao UV apos tentativa invalida: " + oculosDeSol.getNivelProtecaoUv());

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

        System.out.println("\n--- Teste de fogo: Polimorfismo em acao ---");
        for (Oculos oculos : colecaoDeOculos) {
            System.out.println(oculos.descreverUso());
        }

        // TENTATIVA DE BURLAR O SISTEMA
        // meuOculos.grau = 999.0; // vai exibir erro vermelho
    }
}




