package eat.just.demo.tech.justeat.restaurant_details.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "StandardResolutionURL"
})
public class Logo {

    @JsonProperty("StandardResolutionURL")
    private String standardResolutionURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StandardResolutionURL")
    public String getStandardResolutionURL() {
        return standardResolutionURL;
    }

    @JsonProperty("StandardResolutionURL")
    public void setStandardResolutionURL(String standardResolutionURL) {
        this.standardResolutionURL = standardResolutionURL;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
