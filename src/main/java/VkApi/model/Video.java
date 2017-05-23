package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {

    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("owner_id")
    private int owner_id;

    public int getOwnerId() { return this.owner_id; }

    public void setOwnerId(int owner_id) { this.owner_id = owner_id; }

    @JsonProperty("title")
    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    @JsonProperty("duration")
    private int duration;

    public int getDuration() { return this.duration; }

    public void setDuration(int duration) { this.duration = duration; }

    @JsonProperty("description")
    private String description;

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    @JsonProperty("date")
    private int date;

    public int getDate() { return this.date; }

    public void setDate(int date) { this.date = date; }

    @JsonProperty("comments")
    private int comments;

    public int getComments() { return this.comments; }

    public void setComments(int comments) { this.comments = comments; }

    @JsonProperty("views")
    private int views;

    public int getViews() { return this.views; }

    public void setViews(int views) { this.views = views; }

    @JsonProperty("photo_130")
    private String photo_130;

    public String getPhoto130() { return this.photo_130; }

    public void setPhoto130(String photo_130) { this.photo_130 = photo_130; }

    @JsonProperty("photo_320")
    private String photo_320;

    public String getPhoto320() { return this.photo_320; }

    public void setPhoto320(String photo_320) { this.photo_320 = photo_320; }

    @JsonProperty("photo_640")
    private String photo_640;

    public String getPhoto640() { return this.photo_640; }

    public void setPhoto640(String photo_640) { this.photo_640 = photo_640; }

    @JsonProperty("access_key")
    private String access_key;

    public String getAccessKey() { return this.access_key; }

    public void setAccessKey(String access_key) { this.access_key = access_key; }

    @JsonProperty("platform")
    private String platform;

    public String getPlatform() { return this.platform; }

    public void setPlatform(String platform) { this.platform = platform; }

    @JsonProperty("can_add")
    private int can_add;

    public int getCanAdd() { return this.can_add; }

    public void setCanAdd(int can_add) { this.can_add = can_add; }

}
