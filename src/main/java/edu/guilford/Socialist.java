package edu.guilford;

public class Socialist extends Country implements Comparable<Socialist>{
    private String economy;

//Constructor
public Socialist (String continentName, String ocean, String countryName, String language,  String economy) {
    super(continentName, ocean, countryName, language);
    this.economy = economy;
}

//Getters and Setters
public String getEconomy() {
    return economy;
}
public void setEconomy(String economy) {
    this.economy = economy;
}

//Abstract method
@Override
public String language() {
    return "The official language of " + getCountryName() + " is " + getLanguage() + ".";
}


public void UnitedNations() {
    System.out.println(countryName + " is in the United Nations.");
}

@Override
public int compareTo(Socialist other) {
    // We can compare the last names first using the compareTo method of
    // the String class. String is Comparable, so it has a compareTo method
    int result = countryName.compareTo(other.countryName);
    // If the last names are the same, we can compare the first names
    if (result == 0) {
        result = continentName.compareTo(other.continentName);
    }
    return result;
}
}
