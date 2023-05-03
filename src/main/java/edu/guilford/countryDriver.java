package edu.guilford;

import java.util.Arrays;

public class countryDriver 
{
    public static void main( String[] args )
    {
    Socialist Cuba = new Socialist("North America", "Atlantic", "Cuba", "Spanish", "Central");
    Socialist Norway = new Socialist("Europe", "Atlantic", "Norway", "Norwegian", "Central");
    Socialist Denmark = new Socialist("Europe","Atlantic", "Denamrk", "Danish", "Central" );
    Democratic USA = new Democratic("North America", "Atlantic", "USA", "English", "Barack Obama");
    Democratic Canada = new Democratic("North America", "Atlantic", "Canada", "English", "Justin Trudeau");
    Democratic Mexico = new Democratic("North America", "Atlantic", "Mexico", "Spanish", "Andres Manuel Lopez Obrador");
    Authoritarian China = new Authoritarian("Asia", "Pacific", "China", "Mandarin", "Xi Jinping");
    Authoritarian NorthKorea = new Authoritarian("Asia", "Pacific", "North Korea", "Korean", "Kim Jong-un");
    Authoritarian Russia = new Authoritarian("Europe", "Atlantic", "Russia", "Russian", "Vladimir Putin");

    System.out.println(Cuba.language());
    USA.UnitedNations();
    
    //Create an arrary containing all the countries
    System.out.println("The socialist countries are: ");
    Socialist[] socialistCountries = {Cuba, Norway, Denmark};
    Arrays.sort(socialistCountries);

    for (Socialist country : socialistCountries) {
        System.out.println(country.getCountryName());
    }

    System.out.println("The democratic countries are: ");
    Democratic[] democraticCountries = {USA, Canada, Mexico};
    Arrays.sort(democraticCountries);
    for (Democratic country : democraticCountries) {
        System.out.println(country.getCountryName());
    }

    System.out.println("The authoritarian countries are: ");
    Authoritarian[] authoritarianCountries = {China, NorthKorea, Russia};
    Arrays.sort(authoritarianCountries);
    for (Authoritarian country : authoritarianCountries) {
        System.out.println(country.getCountryName());
    }

}
}
