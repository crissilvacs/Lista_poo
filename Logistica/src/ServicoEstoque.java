public class ServicoEstoque {
    public static boolean isAvailable(Produto produto) {
        System.out.println("Verificando disponibilidade do produto: " + produto.name);
        return true; // Simulação: sempre disponível
    }
}
