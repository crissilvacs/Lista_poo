public interface PPay {
    //metodos
    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpMonthDate();
    int getCVVNo();
    double getTotalAmount();

    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setCVVNo(int cVVNo);
    void setTotalAmount(double totalAmount);
}
