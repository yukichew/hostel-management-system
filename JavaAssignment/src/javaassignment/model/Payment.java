package javaassignment.model;

public class Payment {
    private double amount;
    private String datePaid;
    private String paymentMethod;

    public Payment(double amount, String datePaid, String paymentMethod) {
        this.amount = amount;
        this.datePaid = datePaid;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}