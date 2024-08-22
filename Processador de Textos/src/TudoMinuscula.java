public class TudoMinuscula extends ProcessadorTexto {
// metodo passeia sobre o array de caracteres
    @Override
    protected char[] converterCaracteres(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return chars;
    }
}
