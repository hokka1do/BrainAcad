package serialized;

import java.io.Serializable;

public class CreditCard implements Serializable {
    protected enum CARD_TYPE {VISA, MASTERCARD}

    private CARD_TYPE card_type;
    private String bankName;
    private long cardNumber;
    private int expDate;
    private int cvvCode;

    public CreditCard(CARD_TYPE card_type_default, String bankName, long cardNumber, int expDate, int cvvCode) {
        this.card_type = card_type_default;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvvCode = cvvCode;
    }

    public CARD_TYPE getCard_type() {
        return card_type;
    }

    public void setCard_type(CARD_TYPE card_type_default) {
        this.card_type = card_type_default;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public int getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(int cvvCode) {
        this.cvvCode = cvvCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "card_type=" + card_type +
                ", bankName='" + bankName + '\'' +
                ", cardNumber=" + cardNumber +
                ", expDate=" + expDate +
                ", cvvCode=" + cvvCode +
                '}';
    }
}
/*
1.Сериализовать POJOобъектв файл
•СоздатьклассCreditCard с полями:
•cardType (viza/master card)–можноenum
•bankName
•cardNumber
•exp
•cvv
•Реализовать в классе интерфейс Serializable
•Создать геттеры/сеттеры и toString
 */
