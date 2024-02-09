package dmit2015.faces;

import java.io.Serializable;

import dmit2015.model.CanadianPersonalIncomeTax;
import lombok.Getter;
import org.omnifaces.util.Messages;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;

import java.io.Serializable;

/**
 * This class face named Personitax having interact with CanadianPersonalIncomeTax model.
 * It includes methods are federalIncomeTax,provincialIncomeTax,totalIncomeTax
 *
 * @author Ishan Verma
 * @version 2024.02.08
 */
@Named("personitax")
@ViewScoped

public class CanadianITaxView implements Serializable {

    @Getter
    private CanadianPersonalIncomeTax tax = new CanadianPersonalIncomeTax();

    @PostConstruct
    public void init() {
    }

    public void federalIncomeTax(){
        Messages.addGlobalInfo("The federal IncomeTax is {0} ",
                tax.federalIncomeTax());
    }

    public void provincialIncomeTax(){
        Messages.addGlobalInfo("The Provincial IncomeTax is {0} ",
                tax.provincialIncomeTax());
    }
    public void totalIncomeTax(){
        Messages.addGlobalInfo("The Total IncomeTax is {0} ",
                tax.totalIncomeTax());
    }
}
