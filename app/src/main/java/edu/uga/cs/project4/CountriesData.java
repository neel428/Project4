package edu.uga.cs.project4;

import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;

import android.content.Context;
import android.util.Log;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesData {
     public List<Countries> countries;
     private int size;

     public CountriesData() {
         countries = new ArrayList<Countries>();
         try {

             Context context;
             InputStream in_s = getClass().getClassLoader().getResourceAsStream("country_continent.csv");

//             CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
//             CSVReader readerBuilder = new CSVReaderBuilder(new InputStreamReader(in_s)).withCSVParser(parser).build();
             CSVReader reader = new CSVReader(new InputStreamReader(in_s));

             String[] nextRow;
             while ((nextRow = reader.readNext()) != null) {

                 for (int i = 0; i < nextRow.length; i++) {

                     String name = nextRow[0];
                     String continent = nextRow[1];
                     Countries country = new Countries(name, continent);
                     countries.add(country);


                 }
             }
         }
         catch(Exception e){
                 Log.e(TAG, e.toString());
         }

     }

     public List<Countries> getCountries(){
         return countries;
     }

     public void setCountries(List<Countries> countries){
         this.countries = countries;
     }


}
