package src.models;

import java.util.ArrayList;

public class Temperatura {

    public Temperatura(){};

    // Método para converter um arrayList contendo as temperaturas em celsius para Fahrenheit
    public static ArrayList<Double> celsiusToFahrenheit(ArrayList<Double> celsiusTemperatures){
        ArrayList<Double> FahrenheitTemperaturas = new ArrayList<Double>();

        for(double temperature : celsiusTemperatures){
            FahrenheitTemperaturas.add((temperature*9/5) + 32);
        }

        return FahrenheitTemperaturas;
        // Retorna um arrayList contendo as temperaturas convertidas
    }
}
