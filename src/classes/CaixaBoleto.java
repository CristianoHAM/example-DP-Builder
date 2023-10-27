package classes;

import interfaces.Boleto;

import java.util.Calendar;

/*
 * cada instituicao financeira monta o seu boleto
 */

public class CaixaBoleto implements Boleto {

    private String sacado;
    private int nossoNro;
    private Calendar vencimento;
    private double valor;
    private String cedente;
    private String codigoConvenio;
    private String agenciaBancaria;

    public CaixaBoleto(String sacado, String cedente, double valor,
                       Calendar vencimento, int nossoNro, String codigoConvenio, String agenciaBancaria) {
    this.sacado =sacado;
    this.cedente = cedente;
    this.valor = valor;
    this.vencimento = vencimento;
    this.nossoNro = nossoNro;
    this.codigoConvenio = codigoConvenio;
    this.agenciaBancaria = agenciaBancaria;
    }


    @Override
    public String getSacado() {
        // TODO Auto-generated method stub
        return sacado;
    }
    @Override
    public String getCedente() {
        // TODO Auto-generated method stub
        return cedente;
    }
    @Override
    public Calendar getVencimento() {
        // TODO Auto-generated method stub
        return vencimento;
    }
    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        return valor;
    }
    public String getCodigoConvenio() {
        return codigoConvenio;
    }
    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }

    @Override
    public String toString() {
        return "ItauBoleto [sacado=" + sacado + ", nossoNro=" + nossoNro
                + ", vencimento=" + vencimento.getTime() + ", valor=" + valor + ", cedente=" + cedente
                + ", codigoConvenio="+ codigoConvenio + ", agenciaBancaria=" + agenciaBancaria +"]";
    }


}