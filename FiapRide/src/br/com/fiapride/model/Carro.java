package br.com.fiapride.model;

// A palavra 'extends' faz a mágica da herança acontecer!
public class Carro extends Veiculo {

    // Atributo exclusivo do Carro (a mãe Veiculo não tem isso)
    private int capacidadePassageiros;

    // CONSTRUTOR DA FILHA
    public Carro(String placa, String modelo, int capacidadePassageiros) {
        // 'super' significa SUPERCLASSE (Mãe).
        // Estamos repassando a placa e o modelo para o construtor da mãe resolver!
        super(placa, modelo);

        // E aqui o Carro resolve o que é dele:
        this.setCapacidadePassageiros(capacidadePassageiros);
    }

    // Getters e Setters específicos do Carro
    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}