/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmtd;

import java.util.Date;

/**
 *
 * @author Eric
 */
public class MakePayment {
    private int paymentid;
    private int uid;
    private double amount;
    private String paymentmethod;
    private String paymentdescription;
    private Date paymentdate;

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getPaymentdescription() {
        return paymentdescription;
    }

    public void setPaymentdescription(String paymentdescription) {
        this.paymentdescription = paymentdescription;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    
}
