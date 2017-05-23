package VkApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link implements Serializable {

    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    private String caption;

    public String getCaption() { return this.caption; }

    public void setCaption(String caption) { this.caption = caption; }

    private String description;

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    private int is_external;

    public int getIsExternal() { return this.is_external; }

    public void setIsExternal(int is_external) { this.is_external = is_external; }

    private Photo photo;

    public Photo getPhoto() { return this.photo; }

    public void setPhoto(Photo photo) { this.photo = photo; }

    private String preview_url;

    public String getPreviewUrl() { return this.preview_url; }

    public void setPreviewUrl(String preview_url) { this.preview_url = preview_url; }

    private String preview_page;

    public String getPreviewPage() { return this.preview_page; }

    public void setPreviewPage(String preview_page) { this.preview_page = preview_page; }
}
