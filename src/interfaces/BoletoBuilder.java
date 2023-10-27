package interfaces;

import java.util.Calendar;

/*
 * interface para cria��o do Product
 */
public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildCedente(String cedente);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNro(int nossoNro);
    void buildCodigoConvenio(String codigoConvenio);
    void buildAgenciaBancaria(String agenciaBancaria);

    Boleto getBoleto();
}
