import java.net.URL;

public class TaxaDeCambio {

    private static final String APIKey = "https://v6.exchangerate-api.com/v6/a79d250c06d1b22656820d4d/";

    public static double obterTaxaDeCambio(String deMoeda, String paraMoeda){
        try {
            URL url = new URL(APIKey + deMoeda + "/" + paraMoeda);
            
        }
    }
}
