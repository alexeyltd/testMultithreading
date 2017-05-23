package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostSource2 {

    @JsonProperty("type")
    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

}
