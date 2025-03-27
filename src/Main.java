package src;

import java.util.ArrayList;
import java.util.Scanner;
import src.models.Temperatura;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Temperatura temperatureExe = new Temperatura();

    public static boolean menu(){
        int op; //Variável para armazenar a operação selecionada pelo usuário
        System.out.println("--MENU--");
        System.out.println("1- Converter Celsius para Fahrenheit");
        System.out.println("2- Converter Fahrenheit para Celsius");
        System.out.println("3- Converter Celsius para Fahrenheit com ajustes");
        System.out.println("5- Sair");
        System.out.println("Digite sua operação: ");
        op = scan.nextInt();
        scan.nextLine();
        switch (op) {
            case 1:
                System.out.println("Digite as temperaturas: ");
                ArrayList<Double> celsiusTemps = new ArrayList<Double>(); //ArrayLista para armazenar as temperaturas em celsius digitadas pelo usuário
                String temsInput = scan.nextLine(); //Lê os valores como string
                String[] termsInputSeparado = temsInput.split(" "); //Separa as temperaturas e as armazena nesta variável
                for(String temp : termsInputSeparado){
                    celsiusTemps.add(Double.parseDouble(temp)); //Converte cada temperatura de string para double e as armazena no ArrayList celsiusTemp 
                }
                ArrayList<Double> fahreinheitTemps = temperatureExe.celsiusToFahrenheit(celsiusTemps); // Variável que irá receber as temperaturas convertidas para fahrenheit
                for(int i = 0; i < fahreinheitTemps.size(); i++){
                    System.out.printf("%.2f°C = %.2f°F\n",celsiusTemps.get(i),fahreinheitTemps.get(i));
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 5:
                String sair;
                do {
                    System.out.println("Deseja realmente sair ? S/N");
                    sair = scan.nextLine().toUpperCase();
                    switch (sair) {
                        case "S":
                            return false;
                        case "N":
                            return true;
                    }
                } while (!sair.equals("S") || !sair.equals("N"));
            break;
            default:
                System.out.println("Opção inválida");
        }
        return true;
    }


    public static void main(String[] args) {
        boolean exe = true;
        while (exe) {
            exe = menu();
        }
    }
}