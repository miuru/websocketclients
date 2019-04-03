package beans;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "Rules", description = "Rules body")
public class RulesResponse {
    private ArrayList<Rules> rules= new ArrayList<Rules>();

    public RulesResponse() {

    }

    public void setRules(ArrayList<Rules> rules) {
        this.rules = rules;
    }


    public ArrayList<Rules> getRules() {
        return rules;
    }

}
