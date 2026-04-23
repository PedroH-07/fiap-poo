package br.com.fiapride.main;
import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // 1. Criamos uma lista da SUPERCLASSE. Ela aceita qualquer herdeiro!
        List<Veiculo> frota = new ArrayList<>();
        // 2. Colocamos 10 litros em ambos os veículos
        frota.add(new Carro("ABC-1234", "Honda Civic"));
        frota.add(new Moto("DEF-5678", "Honda CG 160"));
        System.out.println("--- ⛽ RELATÓRIO DE AUTONOMIA DA FROTA ---");
        // 3. A MÁGICA: O mesmo comando produz resultados diferentes!
        for (Veiculo veiculo : frota) {
            System.out.println("Veículo: " + veiculo.getModelo());
            // O Java é inteligente: se for Carro, usa a conta do carro. Se for Moto, usa a da moto.
            veiculo.abaster(50);
            System.out.println(veiculo.calcularAutonomia());
            System.out.println("---------------------------------------");
        }
    }
}