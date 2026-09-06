package org.example;

public class Converter {    

  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;

                    //this makes sure it always has 4 decimal places
    return String.format("%.4f lbs", pounds);
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remaingOunces = ounces % 16;

    return pounds + " lbs " + remaingOunces + " oz";
  }
}
