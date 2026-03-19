package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // TESTE 1: A forma correta (Nascimento legalizado)
        Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
        // TESTE 2: Tentando burlar o sistema (Descomente a linha abaixo)
        // Veiculo carroFantasma = new Veiculo();
        // 🛑 ERRO DE COMPILAÇÃO!
        // O Java vai sublinhar de vermelho e dizer: "The constructor Veiculo() is undefined".
        // Por quê? Porque assim que você cria um construtor com regras,
        // o Java DESTRÓI aquele construtor vazio padrão. Você é obrigado a passar a placa!

        System.out.println("--- Iniciando o Sistema FiapRide --- \n");

        // INSTANCIAÇÃO (Usando o Construtor!)
        // Não precisamos mais de passageiro.nome = "Ana", já passamos tudo de uma vez.
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
        System.out.println(">>> Recarga Passageiro 1:");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
        System.out.println(">>> Recarga Passageiro 2:");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("\n--- Status dos Passageiros ---");
        // Lendo os dados com os Getters:
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("\n--- Realizando Viagens ---");
        System.out.println("Pagando viagem do passageiro 1 (Ana)...");
        passageiro1.pagarViagem(20.0); // Ana tem 50, vai sobrar 30.

        System.out.println("\nPagando viagem do passageiro 2 (Carlos)...");
        passageiro2.pagarViagem(20.0); // Carlos tem 12.5. O sistema DEVE bloquear!

        // Tente hackear o sistema descomentando a linha abaixo:
        // passageiro1.saldo = 999999.0; // O Java vai exibir erro vermelho! A proteção funcionou!
    }
}