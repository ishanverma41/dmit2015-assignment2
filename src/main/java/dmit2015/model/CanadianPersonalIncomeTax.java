package dmit2015.model;

import lombok.Getter;
import lombok.Setter;

/**
 * This class model of CanadianPersonalIncomeTax having taxYear,tax Income and Province properties
 * and methods are Federal Income tax,Provincial Income Tax and Total Income Tax.
 *
 * @author Ishan Verma
 * @version 2024.02.08
 */
public class CanadianPersonalIncomeTax {
    @Setter @Getter
    private int taxYear = 2023;

    @Setter @Getter
    private double taxableIncome = 50000;

    @Setter @Getter
    private String province = "AB";

    public CanadianPersonalIncomeTax(){

    }

    public CanadianPersonalIncomeTax(int taxYear,double taxableIncome,String province)
    {
            this.taxableIncome = taxableIncome;
    }

    public double federalIncomeTax()
    {

        double remain = this.taxableIncome;
        double taxAmount = 0;
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(53359,0));
            taxAmount += ((taxIncome)/100)*15;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(106717,53359));
            taxAmount += ((taxIncome)/100)*20.5;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(165430,106717));
            taxAmount += ((taxIncome)/100)*26;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(235675,165430));
            taxAmount += ((taxIncome)/100)*29;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = remain;
            taxAmount += ((taxIncome)/100)*33;
            remain = remain - taxIncome;
        }
        return taxAmount;
    }

    public double provincialIncomeTax(){

        double remain = this.taxableIncome;
        double taxAmount = 0;
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(142292,0));
            taxAmount += ((taxIncome)/100)*10;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(170751,142292));
            taxAmount += ((taxIncome)/100)*12;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(227668,170751));
            taxAmount += ((taxIncome)/100)*13;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = Math.min(remain,Math.subtractExact(341502,227668));
            taxAmount += ((taxIncome)/100)*14;
            remain = remain - taxIncome;
        }
        if(remain!=0)
        {
            double taxIncome = remain;
            taxAmount += ((taxIncome)/100)*15;
            remain = remain - taxIncome;
        }
        return taxAmount;

    }
    public double totalIncomeTax(){
       double fedraltax = federalIncomeTax();
       double provincialtax = provincialIncomeTax();
       return fedraltax + provincialtax;
    }
}
