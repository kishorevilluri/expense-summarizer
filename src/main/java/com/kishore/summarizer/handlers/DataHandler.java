package com.kishore.summarizer.handlers;

import com.kishore.summarizer.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {

    public static void retrieveTransactions(String[] transactionsArray) {
        List<Transaction> transactions = new ArrayList<>();
        for(String transaction : transactionsArray){
            //Condition to only retrieve the info if the string starts with a date.
            //if(transaction.st)
            String[] array = transaction.split(" ");
            Transaction trans = new Transaction();
            trans.setDate(array[0]);
            trans.setService(array[1]);
            trans.setAmount(Integer.parseInt(array[3].replace('$',' ').stripLeading()));
            transactions.add(trans);
        }
    }
}
