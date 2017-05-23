package VkApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Group
{
    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("name")
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @JsonProperty("screen_name")
    private String screen_name;

    public String getScreenName() { return this.screen_name; }

    public void setScreenName(String screen_name) { this.screen_name = screen_name; }

    @JsonProperty("is_closed")
    private int is_closed;

    public int getIsClosed() { return this.is_closed; }

    public void setIsClosed(int is_closed) { this.is_closed = is_closed; }

    @JsonProperty("type")
    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

    @JsonProperty("photo_50")
    private String photo_50;

    public String getPhoto50() { return this.photo_50; }

    public void setPhoto50(String photo_50) { this.photo_50 = photo_50; }

    @JsonProperty("photo_100")
    private String photo_100;

    public String getPhoto100() { return this.photo_100; }

    public void setPhoto100(String photo_100) { this.photo_100 = photo_100; }

    @JsonProperty("photo_200")
    private String photo_200;

    public String getPhoto200() { return this.photo_200; }

    public void setPhoto200(String photo_200) { this.photo_200 = photo_200; }
}
