package classes;

import interfaces.Boleto;
import interfaces.BoletoBuilder;

import java.util.Calendar;

/*
 * a instituicao tem um criador de boletos
 */
public class CaixaBoletoBuilder implements BoletoBuilder {

	private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNro;
    private String codigoConvenio;
    private String agenciaBancaria;
    @Override
    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    @Override
    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }
    @Override
    public void buildValor(double valor) {
        this.valor = valor;
    }
    @Override
    public void buildVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }
    @Override
    public void buildNossoNro(int nossoNro) {
        this.nossoNro = nossoNro;
    }
    @Override
    public void buildCodigoConvenio(String codigoConvenio) { this.codigoConvenio = codigoConvenio; }
    @Override
    public void buildAgenciaBancaria(String agenciaBancaria) { this.agenciaBancaria = agenciaBancaria; }
    @Override
    public Boleto getBoleto() {  
        return new CaixaBoleto(sacado,cedente,valor,vencimento,nossoNro,codigoConvenio,agenciaBancaria);
    }
}
