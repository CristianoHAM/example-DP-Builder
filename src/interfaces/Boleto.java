package interfaces;
import java.util.Calendar;
public interface Boleto {
    String getSacado();   
    String getCedente();
    Calendar getVencimento();
    double getValor();
   
}
