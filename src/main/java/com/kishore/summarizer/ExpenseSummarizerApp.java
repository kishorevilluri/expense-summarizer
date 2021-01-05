package com.kishore.summarizer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class ExpenseSummarizerApp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\villu\\OneDrive\\Desktop\\2020-08-07.pdf");
        PDDocument doc = PDDocument.load(file);
        PDFTextStripper docText = new PDFTextStripper();
        docText.setSortByPosition(true);
        String statementText = docText.getText(doc);
        int transIndex = statementText.indexOf("Spend Amount");
        int feesIndex = statementText.lastIndexOf("Total Fees for this Period");
        String transactions = statementText.substring(transIndex, feesIndex);
        String[] s = transactions.split("\n");
        for(String ss : s){
            System.out.println(ss);
        }
        doc.close();
    }
}