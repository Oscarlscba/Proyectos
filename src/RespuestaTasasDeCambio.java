import java.util.Map;

public class RespuestaTasasDeCambio {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getCodigoBase() {
        return base_code;
    }

    public void setCodigoBase(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getTasasDeConversion() {
        return conversion_rates;
    }

    public void setTasasDeConversion(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
