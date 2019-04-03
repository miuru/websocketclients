package beans;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExgConf {
    private String side;
    private String type;
    private boolean local;
    private int gtdMaxNoOfDays;
    private String exg;
    private String subAllowed;
    private boolean minMax;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public int getGtdMaxNoOfDays() {
        return gtdMaxNoOfDays;
    }

    public void setGtdMaxNoOfDays(int gtdMaxNoOfDays) {
        this.gtdMaxNoOfDays = gtdMaxNoOfDays;
    }

    public String getExg() {
        return exg;
    }

    public void setExg(String exg) {
        this.exg = exg;
    }

    public String getSubAllowed() {
        return subAllowed;
    }

    public void setSubAllowed(String subAllowed) {
        this.subAllowed = subAllowed;
    }

    public boolean isMinMax() {
        return minMax;
    }

    public void setMinMax(boolean minMax) {
        this.minMax = minMax;
    }
}
