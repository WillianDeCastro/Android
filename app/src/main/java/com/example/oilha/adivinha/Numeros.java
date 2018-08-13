package com.example.oilha.adivinha;

import java.util.Random;

public class Numeros {
    private int _NumberGen;

    public  int setNumberGen;

    private int GerarNumero()
    {
        Random rd = new Random();
        return rd.nextInt(10);
    }

    public String MensagemFinal(){

        this.setNumberGen = GerarNumero();

        return  "o número gerado é: " + this.setNumberGen;
    }
}
