public class Mainpag {
    public static void main(String[] args) {
        // Simulação de um objeto MPay existente
        MPay mPay = new MPayImpl();
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCustomerName("Cristina Silva");
        mPay.setCardExpMonth("19");
        mPay.setCardExpYear("2029");
        mPay.setCVVNo(123);
        mPay.setTotalAmount(1000.0);

        // Adaptando MPay para PPay
        PPay pPay = new MPayToPPayAdapter(mPay);

        // Testando o PPay adaptado
        testPPay(pPay);
    }

    public static void testPPay(PPay pPay) {
        System.out.println(pPay.getCardOwnerName());
        System.out.println(pPay.getCustCardNo());
        System.out.println(pPay.getCardExpMonthDate());
        System.out.println(pPay.getCVVNo());
        System.out.println(pPay.getTotalAmount());
    }
}
