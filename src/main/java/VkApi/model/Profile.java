package VkApi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {

    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("first_name")
    private String first_name;

    public String getFirstName() { return this.first_name; }

    public void setFirstName(String first_name) { this.first_name = first_name; }

    @JsonProperty("last_name")
    private String last_name;

    public String getLastName() { return this.last_name; }

    public void setLastName(String last_name) { this.last_name = last_name; }

    @JsonProperty("sex")
    private int sex;

    public int getSex() { return this.sex; }

    public void setSex(int sex) { this.sex = sex; }

    @JsonProperty("screen_name")
    private String screen_name;

    public String getScreenName() { return this.screen_name; }

    public void setScreenName(String screen_name) { this.screen_name = screen_name; }

    @JsonProperty("photo_50")
    private String photo_50;

    public String getPhoto50() { return this.photo_50; }

    public void setPhoto50(String photo_50) { this.photo_50 = photo_50; }

    @JsonProperty("photo_100")
    private String photo_100;

    public String getPhoto100() { return this.photo_100; }

    public void setPhoto100(String photo_100) { this.photo_100 = photo_100; }

    @JsonProperty("online")
    private int online;

    public int getOnline() { return this.online; }

    public void setOnline(int online) { this.online = online; }

}
