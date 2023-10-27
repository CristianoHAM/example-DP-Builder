package classes;
import java.util.Calendar;
import interfaces.Boleto;
import interfaces.BoletoBuilder;
/*
 * a instituicao tem um criador de boletos
 */
public class ItauBoletoBuilder implements BoletoBuilder {

	private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNro;

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
    public void buildCodigoConvenio(String codigoConvenio) { }
    @Override
    public void buildAgenciaBancaria(String agenciaBancaria) { }
    @Override
    public Boleto getBoleto() {  
        return new ItauBoleto(sacado,cedente,valor,vencimento,nossoNro);
    }
}
