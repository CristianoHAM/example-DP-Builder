package generator;

import java.util.Calendar;

import interfaces.Boleto;
import interfaces.BoletoBuilder;

public class GeneratorBoleto {
    //c�digo orientado a interfaces
    private BoletoBuilder boletoBuilder;
    //espero um objeto que implemente o criador de boleto
    public GeneratorBoleto(BoletoBuilder boletoBuilder) {
        super();
        this.boletoBuilder = boletoBuilder;
    }
    public Boleto geraBoleto(){
    //informa��es sobre o boleto a ser gerado
        boletoBuilder.buildSacado("Rodrigo Santos");
        boletoBuilder.buildCedente("Est�cio");
        boletoBuilder.buildValor(2000.00);
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 20);
        boletoBuilder.buildVencimento(vencimento);
        boletoBuilder.buildNossoNro(54321);
        boletoBuilder.buildCodigoConvenio("cv09");
        boletoBuilder.buildAgenciaBancaria("AG028-2");
        //olha isso aqui que m�gico
        Boleto boleto = boletoBuilder.getBoleto();
        return boleto;
    }
}