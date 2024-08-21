public class Maintexto {
    public static void main(String[] args) {
        ProcessadorTexto processadorMaiuscula = new TudoMaiuscula();
        ProcessadorTexto processadorMinuscula = new TudoMinuscula();

        String textoOriginal = "ExEmPlO De TeXtO";

        String textoMaiusculo = processadorMaiuscula.converterTexto(textoOriginal);
        String textoMinusculo = processadorMinuscula.converterTexto(textoOriginal);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto em Maiúsculo: " + textoMaiusculo);
        System.out.println("Texto em Minúsculo: " + textoMinusculo);
    }
}
