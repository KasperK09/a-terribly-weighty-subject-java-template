package org.example;

public class Converter {    

  public double toPounds(int ounces) {
    double pounds = ounces / 16.0;

    return pounds;
  }

  public double toPoundsAndOunces(int ounces) {
    int remaingOunces = ounces % 16;

    return remaingOunces;
  }
}
