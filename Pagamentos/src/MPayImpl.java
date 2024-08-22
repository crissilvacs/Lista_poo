public class MPayImpl implements MPay {
  // Atributos
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private int cVVNo;
    private double totalAmount;
//metodos
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public int getCVVNo() {
        return cVVNo;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCVVNo(int cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
