package VkApi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestParam {

    @JsonProperty("key")
    private String key;

    public String getKey() { return this.key; }

    public void setKey(String key) { this.key = key; }

    @JsonProperty("value")
    private String value;

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }
}
