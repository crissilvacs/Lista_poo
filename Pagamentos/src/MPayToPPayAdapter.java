public class MPayToPPayAdapter implements PPay {
 //Mpay tratada como Ppay  
    private MPay mPay;

    public MPayToPPayAdapter(MPay mPay) {
        this.mPay = mPay;
    }
//metodos
    @Override
    public String getCustCardNo() {
        return mPay.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        return mPay.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        return mPay.getCardExpMonth() + "/" + mPay.getCardExpYear();
    }

    @Override
    public int getCVVNo() {
        return mPay.getCVVNo();
    }

    @Override
    public double getTotalAmount() {
        return mPay.getTotalAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        mPay.setCreditCardNo(custCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        mPay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] parts = cardExpMonthDate.split("/");
        if (parts.length == 2) {
            mPay.setCardExpMonth(parts[0]);
            mPay.setCardExpYear(parts[1]);
        }
    }

    @Override
    public void setCVVNo(int cVVNo) {
        mPay.setCVVNo(cVVNo);
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        mPay.setTotalAmount(totalAmount);
    }
}
