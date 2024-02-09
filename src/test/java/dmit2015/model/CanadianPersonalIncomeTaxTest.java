package dmit2015.model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This Test Class for CanadianPersonalIncome
 *
 * @author Ishan Verma
 * @version 2024.02.08
 */
public class CanadianPersonalIncomeTaxTest {


    @ParameterizedTest
    @CsvSource(value = {
            "26679.50,4001.93",
            "53359.00,8003.85",
            "80038.00,13473.05",
            "106717.00,18942.24",
            "136073.50,26574.93",
            "165430.00,34207.62",
            "200552.50,44393.15",
            "235675.00,54578.67",
            "471350.00,132351.42"
    })
    void fedralIncomeTax( double taxableIncome,double fedralIncomeAmount) {
        var tax = new CanadianPersonalIncomeTax();
        tax.setTaxableIncome(taxableIncome);
        assertEquals(fedralIncomeAmount, tax.federalIncomeTax(),0.5);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "71146.00,7114.60",
            "142292.00,14229.20",
            "156521.50,15936.74",
            "170751.00,17644.28",
            "199209.50,21343.89",
            "227668.00,25043.49",
            "284585.00,33011.87",
            "341502.00,40980.25",
            "512253.00,66592.90"
    })

    void provincialIncomeTax( double taxableIncome,double provincialIncomeAmount) {
        var tax = new CanadianPersonalIncomeTax();
        tax.setTaxableIncome(taxableIncome);
        assertEquals(provincialIncomeAmount, tax.provincialIncomeTax(),0.5);
    }
}
