package com.GurpreetKaur;
/**
 * @author Gurpreet Kaur
 */

import javax.swing.*;
//Inherit SalesCommission class
public class PayGross extends SalesCommission implements IDisplay{
    private double pay;
    public PayGross()
    {

    }
    public PayGross(double sales, double rate, double commission, double advance, String input, double pay) {
        super(sales, rate, commission, advance, input);
        this.pay = pay;
    }

    public double getPay() {
        pay = commission - advance;
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public void display() {
        JOptionPane.showMessageDialog(null, "Commission rate is " +
                percent.format(rate) +"($"+dollar.format(commission)+")"+ ". The amount of pay is $" + dollar.format(getPay()));
    }
}
