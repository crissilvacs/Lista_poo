public interface MPay {
    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    String getCardExpYear();
    int getCVVNo();
    double getTotalAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCVVNo(int cVVNo);
    void setTotalAmount(double totalAmount);
}
