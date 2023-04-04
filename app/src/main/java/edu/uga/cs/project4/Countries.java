package edu.uga.cs.project4;

public class Countries {
    String Country;
    String Continent;

    public Countries(){
        this.Country = null;
        this.Continent = null;
    }
    public Countries(String Country, String Continent){
        this.Country = Country;
        this.Continent = Continent;
    }

    public String getCountry(){
        return Country;
    }

    public String getContinent(){
        return this.Continent;
    }

    public void setCountry(String Country){
        this.Country = Country;
    }

    public void setContinent( String Continent){
        this.Continent = Continent;
    }


}
