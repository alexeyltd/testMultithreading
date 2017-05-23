package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Photo {

    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("album_id")
    private int album_id;

    public int getAlbumId() { return this.album_id; }

    public void setAlbumId(int album_id) { this.album_id = album_id; }

    @JsonProperty("owner_id")
    private int owner_id;

    public int getOwnerId() { return this.owner_id; }

    public void setOwnerId(int owner_id) { this.owner_id = owner_id; }

    @JsonProperty("user_id")
    private int user_id;

    public int getUserId() { return this.user_id; }

    public void setUserId(int user_id) { this.user_id = user_id; }

    @JsonProperty("photo_75")
    private String photo_75;

    public String getPhoto75() { return this.photo_75; }

    public void setPhoto75(String photo_75) { this.photo_75 = photo_75; }

    @JsonProperty("photo_130")
    private String photo_130;

    public String getPhoto130() { return this.photo_130; }

    public void setPhoto130(String photo_130) { this.photo_130 = photo_130; }

    @JsonProperty("photo_604")
    private String photo_604;

    public String getPhoto604() { return this.photo_604; }

    public void setPhoto604(String photo_604) { this.photo_604 = photo_604; }

    @JsonProperty("photo_807")
    private String photo_807;

    public String getPhoto807() { return this.photo_807; }

    public void setPhoto807(String photo_807) { this.photo_807 = photo_807; }

    @JsonProperty("width")
    private int width;

    public int getWidth() { return this.width; }

    public void setWidth(int width) { this.width = width; }

    @JsonProperty("height")
    private int height;

    public int getHeight() { return this.height; }

    public void setHeight(int height) { this.height = height; }

    @JsonProperty("text")
    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }

    @JsonProperty("date")
    private int date;

    public int getDate() { return this.date; }

    public void setDate(int date) { this.date = date; }

    @JsonProperty("post_id")
    private int post_id;

    public int getPostId() { return this.post_id; }

    public void setPostId(int post_id) { this.post_id = post_id; }

    @JsonProperty("access_key")
    private String access_key;

    public String getAccessKey() { return this.access_key; }

    public void setAccessKey(String access_key) { this.access_key = access_key; }

}
