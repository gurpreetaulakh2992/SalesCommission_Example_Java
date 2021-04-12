package com.GurpreetKaur;
/**
 * @author Gurpreet Kaur
 */

import javax.swing.*;
import java.text.DecimalFormat;

public abstract class SalesCommission implements IDisplay{
    protected double sales;
    protected double rate;
    protected double commission;
    protected double advance;
    protected String input;
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // Create a DecimalFormat object for percentages.
    DecimalFormat percent = new DecimalFormat("#0%");

    public SalesCommission() {
    }

    public SalesCommission(double sales, double rate, double commission, double advance,String input) {
        this.sales = sales;
        this.rate = rate;
        this.commission = commission;
        this.advance = advance;
        this.input=input;
    }

    public double getSales() {
        input = JOptionPane.showInputDialog("Enter the amount of monthly sales.");
        sales = Double.parseDouble(input);
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        if (this.sales < 10000)
            rate = 0.05;            // 5% commission rate
        else if (this.sales < 15000)
            rate = 0.1;             // 10% commission rate
        else if (this.sales < 18000)
            rate = 0.12;            // 12% commission rate
        else if (this.sales < 22000)
            rate = 0.15;            // 15% commission rate
        else
            rate = 0.16;            // 16% commission rate
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCommission() {
        return commission=this.rate*this.sales;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getAdvance() {
        input = JOptionPane.showInputDialog("Enter the amount of advanced pay.");
        advance = Double.parseDouble(input);
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }


}
