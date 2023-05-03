package edu.guilford;

abstract class Country {
    protected String continentName;
    protected String ocean;
    protected String countryName;
    protected String language;


    // Constructors
    public Country(String continentName, String ocean, String countryName, String language) {
        //Make a switch statement that assigns each continent name to oceans
        //and then assign the values to the variables
        switch (continentName) {
            case "North America":
                this.ocean = "Atlantic";
                break;
            case "South America":
                this.ocean = "Atlantic";
                break;
            case "Europe":
                this.ocean = "Atlantic";
                break;
            case "Africa":
                this.ocean = "Atlantic";
                break;
            case "Asia":
                this.ocean = "Pacific";
                break;
            case "Australia":
                this.ocean = "Pacific";
                break;
            case "Antarctica":
                this.ocean = "Pacific";
                break;
        }
        this.continentName = continentName;
        this.countryName = countryName;
        this.language = language;
    }

    

    // Getters and Setters
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    public String getOcean() {
        return ocean;
    }
    public void setOcean(String ocean) {
        this.ocean = ocean;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        countryName = countryName;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        language = language;
    }


    //To String Method
    @Override
    public String toString() {
        return "Country [continentName=" + continentName + ", countryName=" + countryName + ", ocean=" + ocean + "]";
    }

    //Abstract Method - Each subclasses chooses what to do with this
    public abstract String language();

    //Method that will be inherited by all subclasss (it doesn't have to be overridden)
    //For nations that are not in the United Nations, this method will be overridden
    //In order to change the output

    //protected is closer to private, but 
    public void UnitedNations() {
        System.out.println(countryName + "is in the United Nations.");
    }
    
    //The natural order of strings is alphabetical order
    // @Override
    // public int compareTo(Country country) {
    //     return this.countryName.compareTo(country.countryName);
    // }

}