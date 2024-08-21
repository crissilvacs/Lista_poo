public class Mainpag {
    public static void main(String[] args) {
        // Simulação de um objeto MPay existente
        MPay mPay = new MPayImpl();
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCustomerName("John Doe");
        mPay.setCardExpMonth("12");
        mPay.setCardExpYear("2025");
        mPay.setCVVNo(123);
        mPay.setTotalAmount(100.00);

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
