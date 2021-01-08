package com.kishore.summarizer.model;

public class Transaction {
    private String date;
    private String service;
    private Integer amount;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", service='" + service + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
