package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TifRuleResponse {

    private ArrayList<TifRule> tifRuleSet;
    private ArrayList<ExgConf> exgConf;

    public TifRuleResponse() {

    }

    public ArrayList<TifRule> getTifRuleSet() {
        return tifRuleSet;
    }

    public void setTifRuleSet(ArrayList<TifRule> tifRuleSet) {
        this.tifRuleSet = tifRuleSet;
    }

    public ArrayList<ExgConf> getExgConf() {
        return exgConf;
    }

    public void setExgConf(ArrayList<ExgConf> exgConf) {
        this.exgConf = exgConf;
    }
}
