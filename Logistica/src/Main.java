public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Notebook");

        // Usando o Facade para processar o pedido
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.processarPedido(produto);
    }
}
