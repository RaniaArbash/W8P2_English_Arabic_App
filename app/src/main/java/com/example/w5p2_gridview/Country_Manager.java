package com.example.w5p2_gridview;

import java.util.ArrayList;


public class Country_Manager {

    ArrayList countryList=new ArrayList<>();

    Country_Manager(){
      countryList.add(new Country(R.drawable.ar,R.string.argentina));
       countryList.add(new Country(R.drawable.br,R.string.Brazil));
        countryList.add(new Country(R.drawable.ca,R.string.Canada));
        countryList.add(new Country(R.drawable.cn,R.string.China));
        countryList.add(new Country(R.drawable.de,R.string.Germany));
        countryList.add(new Country(R.drawable.eg,R.string.Egyte));
        countryList.add(new Country(R.drawable.es,R.string.Spain));
        countryList.add(new Country(R.drawable.eu,R.string.EuropeanUnion));
        countryList.add(new Country(R.drawable.fr,R.string.France));
        countryList.add(new Country(R.drawable.gb,R.string.England));
        countryList.add(new Country(R.drawable.it,R.string.Italy));

}
}
