package dmit2015.faces;

import dmit2015.model.Person;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Messages;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * This class face named PersonFace having interact with Person model.
 * It includes methods are onCalculateCurrentAge,onCalculateChineseZodiac,
 * onCalculateOnAge,onAstrologicalSign
 *
 * @author Ishan Verma
 * @version 2024.02.07
 */
@Named("personface")
@ViewScoped
public class PersonFace implements Serializable {


    @Getter
    private Person person = new Person();

    @Setter @Getter
    private java.time.LocalDate onDate = LocalDate.now();

    @PostConstruct
    public void init() {

    }

    public void onCalculateCurrentAge() {
        Messages.addGlobalInfo("The Current age is {0}",
                person.currentAge());
    }
    public void onCalculatechineseZodiac() {
        Messages.addGlobalInfo("The Chinese Zodiac is {0} ",
                person.chineseZodiac());
    }


    public void onCalculateOnAge(java.time.LocalDate onDate) {
        Messages.addGlobalInfo("The Age on is {0} ",
                person.ageOn(onDate));
    }
    public void onAstrologicalSign() {
        Messages.addGlobalInfo("The Astrological Sign is {0} ",
                person.astrologicalSign());
    }


}
