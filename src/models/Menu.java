package src.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

    static Scanner scan = new Scanner(System.in);
    static Temperatura temperaturaExe = new Temperatura();

    public static boolean menu(){
        //Variáveis que serão utilizadas durante a execução do programa
        ArrayList<Double> celsiusTemps = new ArrayList<Double>(); //ArrayLista para manipular as temperaturas em celsius
        String tempsInput;
        String[] tempsInputSeparado;
        ArrayList<Double> fahrenheitTemps = new ArrayList<Double>(); //ArrayLista para manipular as temperaturas em fahrenheit
        String ajusteResp; //Variável para receber S/N se o usuário deseja ajuste ou não
        double ajuste = 0; //Variável que irá receber o ajuste
        boolean verificaAjuste = false; //Variável booleana de acordo com a resposta do ajusteResp
        String arredondamentoResp; //Variável para receber S/N se o usuário deseja arredondamento ou não
        boolean arredondamento = false; //variável para verificar se o usuário quer arredondar ou não os valores

        int op; //Variável para armazenar a operação selecionada pelo usuário
        System.out.println("--MENU--");
        System.out.println("1- Converter Celsius para Fahrenheit");
        System.out.println("2- Converter Fahrenheit para Celsius");
        System.out.println("3- Converter Celsius para Fahrenheit com ajustes");
        System.out.println("4- Converter Fahrenheit para Celsius com ajustes");
        System.out.println("5- Sair");
        System.out.println("Digite sua operação: ");
        op = scan.nextInt();
        scan.nextLine();
        
        switch (op) {
            case 1:
                System.out.println("Digite as temperaturas: ");
                tempsInput = scan.nextLine(); //Lê os valores como string
                tempsInputSeparado = tempsInput.split(" "); //Separa as temperaturas e as armazena nesta variável
                celsiusTemps.clear(); //Limpa o ArrayList celsiusTemps para evitar problemas com valores antigos
                
                for(String temp : tempsInputSeparado){
                    celsiusTemps.add(Double.parseDouble(temp)); //Converte cada temperatura de string para double e as armazena no ArrayList celsiusTemp 
                
                }
                
                fahrenheitTemps.clear(); // Limpa o ArrayList fahrenheitTemps para evitar problemas com valores antigos
                fahrenheitTemps = temperaturaExe.celsiusToFahrenheit(celsiusTemps); // Variável que irá receber as temperaturas convertidas para fahrenheit
                System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                
                for(int i = 0; i < fahrenheitTemps.size(); i++){
                    System.out.printf("%.2f°C = %.2f°F\n",celsiusTemps.get(i),fahrenheitTemps.get(i));
                
                }
                System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                break;
            case 2:
                System.out.println("Digite as temperaturas: ");
                tempsInput = scan.nextLine(); //Lê os valores como string
                tempsInputSeparado = tempsInput.split(" "); //Separa as temperaturas e as armazena nesta variável
                fahrenheitTemps.clear(); // Limpa o ArrayList fahrenheitTemps para evitar problemas com valores antigos
                
                for(String temp : tempsInputSeparado){
                    fahrenheitTemps.add(Double.parseDouble(temp)); //Converte cada temperatura de string para double e as armazena no ArrayList celsiusTemp 
                }

                celsiusTemps.clear(); //Limpa o ArrayList celsiusTemps para evitar problemas com valores antigos
                celsiusTemps = temperaturaExe.fahrenheitToCelsius(fahrenheitTemps); // Variável que irá receber as temperaturas convertidas para fahrenheit
                System.out.println(); //Tornar a resposta mais visível com uma linha vazia

                for(int i = 0; i < fahrenheitTemps.size(); i++){
                    System.out.printf("%.2f°F = %.2f°C\n",fahrenheitTemps.get(i),celsiusTemps.get(i));
                }

                System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                break;
            case 3:
                System.out.println("Digite as temperaturas: ");
                tempsInput = scan.nextLine(); //Lê os valores como string
                tempsInputSeparado = tempsInput.split(" "); //Separa as temperaturas e as armazena nesta variável
                celsiusTemps.clear(); //Limpa o ArrayList celsiusTemps para evitar problemas com valores antigos

                for(String temp : tempsInputSeparado){
                    celsiusTemps.add(Double.parseDouble(temp)); //Converte cada temperatura de string para double e as armazena no ArrayList celsiusTemp 
                }

                System.out.println("Deseja fazer algum ajuste nos resultados das conversões ? S/N");
                ajusteResp = scan.nextLine().toLowerCase();
                scan.nextLine();

                if(ajusteResp.equals("s")){
                    System.out.println("Digite o valor do ajuste. Ex: -1, 1, 2");
                    ajuste = scan.nextDouble();
                    scan.nextLine();
                    verificaAjuste = true;
                }

                System.out.println("Deseja receber os valores arredondados ? S/N");
                arredondamentoResp = scan.nextLine().toLowerCase();
                scan.nextLine();
                arredondamento = false;

                if(arredondamentoResp.equals("s")){
                    arredondamento = true; 
                }

                if(arredondamento && verificaAjuste){
                    temperaturaExe.celsiusToFahrenheit(celsiusTemps, ajuste, true); //Mostra os valores convertidos, ajustados e arredondados
                }else if(arredondamento){
                    temperaturaExe.celsiusToFahrenheit(celsiusTemps,true); //Motra os valores convertidos e arredondados
                }else if(verificaAjuste){
                    temperaturaExe.celsiusToFahrenheit(celsiusTemps,ajuste); //Mostra os valores convertidos e ajustados
                }else{
                    fahrenheitTemps.clear(); // Limpa o ArrayList fahrenheitTemps para evitar problemas com valores antigos
                    fahrenheitTemps = temperaturaExe.celsiusToFahrenheit(celsiusTemps); // Variável que irá receber as temperaturas convertidas para fahrenheit
                    System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                    
                    for(int i = 0; i < fahrenheitTemps.size(); i++){
                        System.out.printf("%.2f°C = %.2f°F\n",celsiusTemps.get(i),fahrenheitTemps.get(i));
                    
                    }
                    System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                }
                break;
            case 4:
                System.out.println("Digite as temperaturas: ");
                tempsInput = scan.nextLine(); //Lê os valores como string
                tempsInputSeparado = tempsInput.split(" "); //Separa as temperaturas e as armazena nesta variável
                fahrenheitTemps.clear(); //Limpa o ArrayList fahrenheitTemps para evitar problemas com valores antigos

                for(String temp : tempsInputSeparado){
                    fahrenheitTemps.add(Double.parseDouble(temp)); //Converte cada temperatura de string para double e as armazena no ArrayList celsiusTemp 
                }

                System.out.println("Deseja fazer algum ajuste nos resultados das conversões ? S/N");
                ajusteResp = scan.nextLine().toLowerCase();
                scan.nextLine();

                if(ajusteResp.equals("s")){
                    System.out.println("Digite o valor do ajuste. Ex: -1, 1, 2");
                    ajuste = scan.nextDouble();
                    scan.nextLine();
                    verificaAjuste = true;
                }

                System.out.println("Deseja receber os valores arredondados ? S/N");
                arredondamentoResp = scan.nextLine().toLowerCase();
                scan.nextLine();
                arredondamento = false;

                if(arredondamentoResp.equals("s")){
                    arredondamento = true; 
                }

                if(arredondamento && verificaAjuste){
                    temperaturaExe.fahrenheitToCelsius(fahrenheitTemps, ajuste, true); //Mostra os valores convertidos, ajustados e arredondados
                }else if(arredondamento){
                    temperaturaExe.fahrenheitToCelsius(fahrenheitTemps,true); //Motra os valores convertidos e arredondados
                }else if(verificaAjuste){
                    temperaturaExe.fahrenheitToCelsius(fahrenheitTemps,ajuste); //Mostra os valores convertidos e ajustados
                }else{
                    celsiusTemps.clear(); //Limpa o ArrayList celsiusTemps para evitar problemas com valores antigos
                    celsiusTemps = temperaturaExe.fahrenheitToCelsius(fahrenheitTemps); // Variável que irá receber as temperaturas convertidas para fahrenheit
                    System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                    for(int i = 0; i < fahrenheitTemps.size(); i++){
                        System.out.printf("%.2f°F = %.2f°C\n",fahrenheitTemps.get(i),celsiusTemps.get(i));
                    }

                    System.out.println(); //Tornar a resposta mais visível com uma linha vazia
                }
                    
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
}