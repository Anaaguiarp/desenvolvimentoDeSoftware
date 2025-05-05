import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vendas!");
        Alimento alimento1 = new Alimento();
        alimento1.setCodigo(1);
        alimento1.setDescricao("Oreo");
        alimento1.setEstoque(10);
        alimento1.setPerecivel(true);
        alimento1.setValidade("05/05/2026");

        Eletronico eletronico1 = new Eletronico();
        eletronico1.setCodigo(2);
        eletronico1.setDescricao("Smartphone");
        eletronico1.setEstoque(2);
        eletronico1.setVoltagem(127);
        eletronico1.setFonteDeEnergia("Bivolt");

        Eletronico eletronico2 = new Eletronico();
        eletronico2.setCodigo(3);
        eletronico2.setDescricao("TV");
        eletronico2.setEstoque(1);
        eletronico2.setVoltagem(127);
        eletronico2.setFonteDeEnergia("Bivolt");

        Venda venda1 = new Venda();
        venda1.setNomeCliente("Juliana");
        venda1.setNotaFiscal(45);
        ArrayList<Produto> list1 = new ArrayList<>();
        list1.add(alimento1);
        list1.add(eletronico1);
        list1.add(eletronico2);
        venda1.setProdutos(list1);

        System.out.println(venda1.toString());
    }
}
