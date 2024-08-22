public class Maintexto {
    public static void main(String[] args) {
        //instanciando os processadores
        ProcessadorTexto processadorMaiuscula = new TudoMaiuscula();
        ProcessadorTexto processadorMinuscula = new TudoMinuscula();

        String textoOriginal = "ExEmPlO De TeXtO";
//usando os processadores
        String textoMaiusculo = processadorMaiuscula.converterTexto(textoOriginal);
        String textoMinusculo = processadorMinuscula.converterTexto(textoOriginal);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto em Maiúsculo: " + textoMaiusculo);
        System.out.println("Texto em Minúsculo: " + textoMinusculo);
    }
}
