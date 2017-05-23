package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Item {

    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screen_name")
    private String screen_name;

    public String getScreenName() { return this.screen_name; }

    public void setScreenName(String screen_name) { this.screen_name = screen_name; }

    @JsonProperty("from_id")
    private int from_id;

    public int getFromId() { return this.from_id; }

    public void setFromId(int from_id) { this.from_id = from_id; }

    @JsonProperty("owner_id")
    private int owner_id;

    public int getOwnerId() { return this.owner_id; }

    public void setOwnerId(int owner_id) { this.owner_id = owner_id; }

    @JsonProperty("date")
    private int date;

    public int getDate() { return this.date; }

    public void setDate(int date) { this.date = date; }

    @JsonProperty("marked_as_ads")
    private int marked_as_ads;

    public int getMarkedAsAds() { return this.marked_as_ads; }

    public void setMarkedAsAds(int marked_as_ads) { this.marked_as_ads = marked_as_ads; }

    @JsonProperty("post_type")
    private String post_type;

    public String getPostType() { return this.post_type; }

    public void setPostType(String post_type) { this.post_type = post_type; }

    @JsonProperty("text")
    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }

    @JsonProperty("attachments")
    private ArrayList<Attachment> attachments;

    public ArrayList<Attachment> getAttachments() { return this.attachments; }

    public void setAttachments(ArrayList<Attachment> attachments) { this.attachments = attachments; }

    @JsonProperty("post_source")
    private PostSource post_source;

    public PostSource getPostSource() { return this.post_source; }

    public void setPostSource(PostSource post_source) { this.post_source = post_source; }

    @JsonProperty("comments")
    private Comments comments;

    public Comments getComments() { return this.comments; }

    public void setComments(Comments comments) { this.comments = comments; }

    @JsonProperty("likes")
    private Likes likes;

    public Likes getLikes() { return this.likes; }

    public void setLikes(Likes likes) { this.likes = likes; }

    @JsonProperty("reposts")
    private Reposts reposts;

    public Reposts getReposts() { return this.reposts; }

    public void setReposts(Reposts reposts) { this.reposts = reposts; }



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

    @JsonProperty("signer_id")
    private int signer_id;

    public int getSigner_id() {
        return signer_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

    @JsonProperty("copy_history")
    private ArrayList<CopyHistory> copy_history;

    public ArrayList<CopyHistory> getCopyHistory() { return this.copy_history; }

    public void setCopyHistory(ArrayList<CopyHistory> copy_history) { this.copy_history = copy_history; }

    @JsonProperty("post_id")
    private int post_id;

    public int getPostId() { return this.post_id; }

    public void setPostId(int post_id) { this.post_id = post_id; }

}
