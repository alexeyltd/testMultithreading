package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CopyHistory {

    @JsonProperty("id")
    private int id;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    @JsonProperty("owner_id")
    private int owner_id;

    public int getOwnerId() { return this.owner_id; }

    public void setOwnerId(int owner_id) { this.owner_id = owner_id; }

    @JsonProperty("from_id")
    private int from_id;

    public int getFromId() { return this.from_id; }

    public void setFromId(int from_id) { this.from_id = from_id; }

    @JsonProperty("date")
    private int date;

    public int getDate() { return this.date; }

    public void setDate(int date) { this.date = date; }

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

}
