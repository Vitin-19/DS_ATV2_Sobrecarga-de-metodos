package src.models;

import java.util.ArrayList;
import java.lang.Math;

public class Temperatura {

    public Temperatura(){};

    // Método para converter um arrayList contendo as temperaturas em celsius para Fahrenheit
    public static ArrayList<Double> celsiusToFahrenheit(ArrayList<Double> celsiusTemperaturas){
        ArrayList<Double> FahrenheitTemperaturas = new ArrayList<Double>();

        for(double temperatura : celsiusTemperaturas){
            FahrenheitTemperaturas.add((temperatura*9/5) + 32);
        }

        return FahrenheitTemperaturas;
        // Retorna um arrayList contendo as temperaturas convertidas
    }

    //Método para converter um arrayList contendo as temperaturas em Fahrenheit para celsius
    public static ArrayList<Double> fahrenheitToCelsius(ArrayList<Double> fahrenheitTemps){
        ArrayList<Double> celsiusTemps = new ArrayList<Double>();

        for(double temp : fahrenheitTemps){
            celsiusTemps.add((temp - 32)*5/9);
        }

        return celsiusTemps;
        // Retorna um arrayList contendo as temperaturas convertidas
    }

    // Método para converter um arrayList contendo as temperaturas em celsius para Fahrenheit fazendo ajuste e arredondando
    public static void celsiusToFahrenheit(ArrayList<Double> celsiusTemperaturas, double ajuste, boolean arrendondamento){
        ArrayList<Double> FahrenheitTemperaturas = new ArrayList<Double>();
        for(double temperatura : celsiusTemperaturas){
            FahrenheitTemperaturas.add(((temperatura*9/5) + 32) + ajuste);
        }
        
        if(arrendondamento){
            double selectTemp;
            for(int i = 0; i < FahrenheitTemperaturas.size(); i++){
                selectTemp = FahrenheitTemperaturas.get(i);
                selectTemp = Math.round(selectTemp);
                FahrenheitTemperaturas.set(i, selectTemp);
            }
        }
        for(int i = 0; i < FahrenheitTemperaturas.size(); i++){
            System.out.printf("%.2f°C = %.0f°F\n",celsiusTemperaturas.get(i),FahrenheitTemperaturas.get(i));
        }

    }

    // Método para converter um arrayList contendo as temperaturas em celsius para Fahrenheit arredonddando a respostas
    public static void celsiusToFahrenheit(ArrayList<Double> celsiusTemperaturas, boolean arrendondamento){
        ArrayList<Double> FahrenheitTemperaturas = new ArrayList<Double>();
        for(double temperatura : celsiusTemperaturas){
            FahrenheitTemperaturas.add(((temperatura*9/5) + 32));
        }
        
        if(arrendondamento){
            double selectTemp;
            for(int i = 0; i < FahrenheitTemperaturas.size(); i++){
                selectTemp = FahrenheitTemperaturas.get(i);
                selectTemp = Math.round(selectTemp);
                FahrenheitTemperaturas.set(i, selectTemp);
            }
        }
        for(int i = 0; i < FahrenheitTemperaturas.size(); i++){
            System.out.printf("%.2f°C = %.0f°F\n",celsiusTemperaturas.get(i),FahrenheitTemperaturas.get(i));
        }

    }

    // Método para converter um arrayList contendo as temperaturas em celsius para Fahrenheit fazendo ajuste
    public static void celsiusToFahrenheit(ArrayList<Double> celsiusTemperaturas, double ajuste){
        ArrayList<Double> FahrenheitTemperaturas = new ArrayList<Double>();
        for(double temperatura : celsiusTemperaturas){
            FahrenheitTemperaturas.add(((temperatura*9/5) + 32) + ajuste);
        }
        
        for(int i = 0; i < FahrenheitTemperaturas.size(); i++){
            System.out.printf("%.2f°C = %.2f°F\n",celsiusTemperaturas.get(i),FahrenheitTemperaturas.get(i));
        }

    }

    // Método para converter um arrayList contendo as temperaturas em Fahrenheit para celsius fazendo ajuste e arredondando
    public static void fahrenheitToCelsius(ArrayList<Double> FahrenheitTemperaturas, double ajuste, boolean arrendondamento){
        ArrayList<Double> celsiusTemperaturas = new ArrayList<Double>();
        for(double temperatura :  FahrenheitTemperaturas){
            celsiusTemperaturas.add((temperatura - 32)*5/9 + ajuste);
        }
        
        if(arrendondamento){
            double selectTemp;
            for(int i = 0; i < celsiusTemperaturas.size(); i++){
                selectTemp = celsiusTemperaturas.get(i);
                selectTemp = Math.round(selectTemp);
                celsiusTemperaturas.set(i, selectTemp);
            }
        }
        
        for(int i = 0; i < celsiusTemperaturas.size(); i++){
            System.out.printf("%.2f°F = %.0f°C\n",FahrenheitTemperaturas.get(i),celsiusTemperaturas.get(i));
        }

    }

    // Método para converter um arrayList contendo as temperaturas em Fahrenheit para celsius arredondando
    public static void fahrenheitToCelsius(ArrayList<Double> FahrenheitTemperaturas,boolean arrendondamento){
        ArrayList<Double> celsiusTemperaturas = new ArrayList<Double>();

        for(double temperatura :  FahrenheitTemperaturas){
            celsiusTemperaturas.add((temperatura - 32)*5/9);
        }
        
        if(arrendondamento){
            double selectTemp;
            for(int i = 0; i < celsiusTemperaturas.size(); i++){
                selectTemp = celsiusTemperaturas.get(i);
                selectTemp = Math.round(selectTemp);
                celsiusTemperaturas.set(i, selectTemp);
            }
        }
        for(int i = 0; i < celsiusTemperaturas.size(); i++){
            System.out.printf("%.2f°F = %.0f°C\n",FahrenheitTemperaturas.get(i),celsiusTemperaturas.get(i));
        }

    }

    // Método para converter um arrayList contendo as temperaturas em Fahrenheit para celsius fazendo ajuste
    public static void fahrenheitToCelsius(ArrayList<Double> FahrenheitTemperaturas, double ajuste){
        ArrayList<Double> celsiusTemperaturas = new ArrayList<Double>();
        for(double temperatura :  FahrenheitTemperaturas){
            celsiusTemperaturas.add((temperatura - 32)*5/9 + ajuste);
        }
        
        for(int i = 0; i < celsiusTemperaturas.size(); i++){
            System.out.printf("%.2f°F = %.0f°C\n",FahrenheitTemperaturas.get(i),celsiusTemperaturas.get(i));
        }

    }
}
