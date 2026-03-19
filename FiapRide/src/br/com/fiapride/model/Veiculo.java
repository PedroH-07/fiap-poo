package br.com.fiapride.model;

public class Veiculo {

    // 1. Atributos sempre privados (Encapsulamento)
    private String placa;
    private String modelo;

    // 2. O CONSTRUTOR (O Cartório)
    public Veiculo(String placa, String modelo) {
        // Usamos o setter privado para validar a placa logo no nascimento!
        this.setPlaca(placa);
        this.modelo = modelo;
        System.out.println("🚗 Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }

    // 3. Getters (Apenas leitura)
    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    // 4. COMPORTAMENTO PÚBLICO (A regra de negócio / Ação)
    // Este é o método que o programa principal vai chamar. Ele representa uma ação real.
    public void atualizarPlaca(String novaPlaca) {
        System.out.println("🔄 Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca); // Chama o método privado que contém a regra de segurança
    }

    // 5. SETTERS PRIVADOS (A engrenagem interna de validação)
    // O modificador é 'private'. Ninguém de fora da classe consegue usar.
    private void setPlaca(String novaPlaca) {
        // Regra de negócio: a placa não pode ser nula nem vazia
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("✅ Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }

    // Obs: O modelo do carro é IMUTÁVEL na vida real (um Fiat Uno não se transforma em um Corolla).
    // Portanto, a regra de negócio exige que NÃO exista um método setModelo()!
}