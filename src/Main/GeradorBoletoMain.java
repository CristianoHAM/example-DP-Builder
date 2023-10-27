package Main;

import classes.CaixaBoletoBuilder;
import classes.ItauBoletoBuilder;
import generator.GeneratorBoleto;
import interfaces.Boleto;
import interfaces.BoletoBuilder;



public class GeradorBoletoMain {
    public static void main(String[] args) {

        BoletoBuilder boletoBuilderIt = new ItauBoletoBuilder();
        GeneratorBoleto generatorBoleto = new GeneratorBoleto(boletoBuilderIt); //itau
        Boleto boletoIt = generatorBoleto.geraBoleto();//retorna o boleto pronto
        System.out.println(boletoIt);

        BoletoBuilder boletoBuilderCa = new CaixaBoletoBuilder();
        GeneratorBoleto generatorBoletoCA = new GeneratorBoleto(boletoBuilderCa);
        Boleto boletoCa = generatorBoletoCA.geraBoleto();
        System.out.println(boletoCa);

         }

}