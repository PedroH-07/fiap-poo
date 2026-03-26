package br.com.fiapride.model;

public class Viagem {

    // 1. Atributos Simples
    private String destino;
    private double valor;

    // 2. ATRIBUTOS DE ASSOCIAÇÃO (Objetos Complexos)
    // Clean Code: O nome da variável indica O PAPEL que o objeto desempenha na Viagem!
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    // 3. CONSTRUTOR (Regra de Negócio)
    // Uma viagem SÓ PODE nascer se tiver um destino, um passageiro e um carro!
    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0; // Inicia zerado, pode ser calculado depois

        System.out.println("✅ Nova viagem solicitada para: " + this.destino);
    }

    // 4. MÉTODOS DE AÇÃO (Comportamento)
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + this.destino);

        // A MÁGICA ACONTECE AQUI: Navegando entre os objetos!
        // Eu entro na Viagem -> pego o Solicitante -> pego o Nome dele.
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veículo: " + this.veiculoUtilizado.getModelo() + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")");
        System.out.println("------------------------\n");
    }

    // Getters para os atributos...
    public String getDestino() { return this.destino; }
    public Passageiro getSolicitante() { return this.solicitante; }
    public Veiculo getVeiculoUtilizado() { return this.veiculoUtilizado; }
}