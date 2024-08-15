public class PedidoFacade {

    public PedidoFacade() {
    }

    public void processarPedido(Produto produto) {
        // Acessando métodos estáticos diretamente pela classe
        if (ServicoEstoque.isAvailable(produto)) {
            System.out.println("Produto disponível. Processando pedido...");
            if (ServicoPagamento.makePayment()) {
                System.out.println("Pagamento aprovado. Enviando produto...");
                ServicoRemessa.shipProduct(produto);
                System.out.println("Produto enviado com sucesso!");
            } else {
                System.out.println("Falha no pagamento. Pedido não pode ser processado.");
            }
        } else {
            System.out.println("Produto não disponível no estoque.");
        }
    }
}
