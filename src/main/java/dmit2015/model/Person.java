package dmit2015.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.Period;



/**
 * This class model of model having firstname,lastname and birthdate properties
 * and methods are currentAge,ageOn,chineseZodiac,astrologicalSign.
 *
 * @author Ishan Verma
 * @version 2024.02.07
 */

public class Person {

    @Setter @Getter
    private String firstname;
    @Setter @Getter
    private String lastname;
    @Setter @Getter
    private java.time.LocalDate birthDate;

    @Setter @Getter




    private String[] chineseZodiac = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};

    public Person(String firstname,String lastname, java.time.LocalDate birthDate)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }
    public Person() {

        this.firstname = "DMIT2015";
        this.lastname = "Student";
        this.birthDate = LocalDate.now();
    }


    public int currentAge() {
        LocalDate now = LocalDate.now();
//        System.out.println(this.birthDate);
        Period period = Period.between(this.birthDate,now);
        int yearz = period.getYears();
//        System.out.println(yearz);
        return yearz;
    }


    public int ageOn(java.time.LocalDate onDate) {
//        System.out.println(this.birthDate);
        Period period = Period.between(this.birthDate,onDate);
        int yearz = period.getYears();
        System.out.println(yearz);
        return yearz;
    }


    public String chineseZodiac() {

        int year= this.birthDate.getYear();
        int index = (year%12);
//        System.out.println(index);
        return this.chineseZodiac[index];
    }


    public String astrologicalSign(){
        LocalDate currentDate = this.birthDate.withYear(2023);
        String[] startmonth = {"2023-03-21","2023-04-20","2023-05-21","2023-06-22","2023-07-23","2023-08-23","2023-09-23","2023-10-23","2023-11-23","2023-12-22","2023-01-01","2023-01-20","2023-02-19"};
        String[] endmonth = {"2023-04-19","2023-05-20","2023-06-21","2023-07-22","2023-08-22","2023-09-22","2023-10-22","2023-11-22","2023-12-21","2023-12-31","2023-01-19","2023-02-18","2023-03-20"};
        String [] Sign = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Capricorn","Aquarius","Pisces"};
        int month=0;
//        System.out.println(currentDate);
        for(int i=0;i<13;i++)
        {
            LocalDate startDate = LocalDate.parse(startmonth[i]);
            LocalDate endDate = LocalDate.parse(endmonth[i]);

            if (currentDate.isAfter(startDate) && currentDate.isBefore(endDate) || currentDate.isEqual(startDate) || currentDate.isEqual(endDate)) {
                month = i;
            }
        }

        return Sign[month];
    }
}
