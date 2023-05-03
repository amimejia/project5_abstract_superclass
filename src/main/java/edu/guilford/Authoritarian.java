package edu.guilford;

public class Authoritarian extends Country implements Comparable<Authoritarian>{
    private String dictator;

    //Constructor
    public Authoritarian(String continentName, String ocean, String countryName, String language, String dictator) {
        super(continentName, ocean, countryName, language);
        this.dictator = dictator;
    }

    //Getters and Setters
    public String getDictator() {
        return dictator;
    }
    public void setDictator(String dictator) {
        this.dictator = dictator;
    }

@Override
public String language() {
    return "The official language of " + getCountryName() + " is " + getLanguage() + ".";
}

//override use here because it must be changes
@Override
public void UnitedNations() {
    System.out.println(countryName + " is in the United Nations.");

}

@Override
public int compareTo(Authoritarian other) {
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
