package edu.guilford;

public class Democratic extends Country implements Comparable<Democratic>{
    private String electedLeader;

//Constructor
public Democratic (String continentName, String ocean, String countryName,String language, String electedLeader) {
    super(continentName, ocean, countryName, language);
    this.electedLeader = electedLeader;
}
//Getters and Setters
public String getElectedLeader() {
    return electedLeader;
}

public void setElectedLeader(String electedLeader) {
    this.electedLeader = electedLeader;
}

@Override
public String language() {
    return "The official language of " + getCountryName() + " is " + getLanguage() + ".";
}

public void UnitedNations() {
    System.out.println(countryName + " is in the United Nations.");
}

@Override
public int compareTo(Democratic other) {
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
