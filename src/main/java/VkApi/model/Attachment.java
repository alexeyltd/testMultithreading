package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Attachment {

    @JsonProperty("type")
    private String type;

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

    @JsonProperty("photo")
    private Photo photo;

    public Photo getPhoto() { return this.photo; }

    public void setPhoto(Photo photo) { this.photo = photo; }

    @JsonProperty("video")
    private Video video;

    public Video getVideo() { return this.video; }

    public void setVideo(Video video) { this.video = video; }

    @JsonProperty("link")
    private Link link;

    public Link getLink() { return this.link; }

    public void setLink(Link link) { this.link = link; }

}
