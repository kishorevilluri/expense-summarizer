package com.kishore.summarizer.handlers;

import com.kishore.summarizer.model.Transaction;
import java.util.ArrayList;
import java.util.List;

public class DataHandler {

    public static void retrieveTransactions(String[] transactionsArray) {
        List<Transaction> transactions = new ArrayList<>();
        String dateRegex = "\\d{2}\\/\\d{2}\\/\\d{2}";
        for(String transaction : transactionsArray){
            Transaction tran = new Transaction();
            //Condition to only retrieve the info if the string starts with a date.
            String tranDate = transaction.split(" ")[0];
            if(Character.isDigit(transaction.charAt(0)) && tranDate.matches(dateRegex)){
                tran.setDate(tranDate);
                transaction = transaction.replaceAll(tranDate,"");
                String[] tranData = transaction.split("\\$",2);
                tran.setService(tranData[0]);
                tran.setAmount(tranData[1]);
                System.out.println(tran.toString());
            }
        }
    }
}