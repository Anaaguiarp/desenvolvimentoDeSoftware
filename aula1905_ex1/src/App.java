import java.util.ArrayList;

public class App {/* ERRO: CONSULTAR DEPOIS */
    public static void main(String[] args) throws Exception {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Veiculo carro = new Carro("Vermelho");
        Veiculo bicicleta = new Bicicleta(true);
        Veiculo caminhao = new Caminhao(50.0);

        carro.acelerar();
        carro.frear();

        bicicleta.acelerar();
        bicicleta.frear();

        caminhao.acelerar();
        caminhao.frear();

        for (Veiculo veiculos : listaVeiculos) {
            System.out.println(veiculos.obterTipo());
        }
    }
}
