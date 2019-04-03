package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "Rules", description = "Rules body")
public class TifRule {

    private int ordTyp;
    private String exg;
    private int mktSts;
    private String tifTyps;



    public int getOrdTyp() {
        return ordTyp;
    }

    public void setOrdTyp(int ordTyp) {
        this.ordTyp = ordTyp;
    }

    public String getExg() {
        return exg;
    }

    public void setExg(String exg) {
        this.exg = exg;
    }

    public int getMktSts() {
        return mktSts;
    }

    public void setMktSts(int mktSts) {
        this.mktSts = mktSts;
    }

    public String getTifTyps() {
        return tifTyps;
    }

    public void setTifTyps(String tifTyps) {
        this.tifTyps = tifTyps;
    }
}
