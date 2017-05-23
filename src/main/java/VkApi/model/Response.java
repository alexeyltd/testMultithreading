package VkApi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Response {

    @JsonProperty("count")
    private int count;

    public int getCount() { return this.count; }

    public void setCount(int count) { this.count = count; }

    @JsonProperty("items")
    private ArrayList<Item> items;

    public ArrayList<Item> getItems() { return this.items; }

    public void setItems(ArrayList<Item> items) { this.items = items; }


    @JsonIgnore
    private ArrayList<Object> profiles;

    public ArrayList<Object> getProfiles() { return this.profiles; }

    public void setProfiles(ArrayList<Object> profiles) { this.profiles = profiles; }


    @JsonProperty("groups")
    private ArrayList<Group> groups;

    public ArrayList<Group> getGroups() { return this.groups; }

    public void setGroups(ArrayList<Group> groups) { this.groups = groups; }
}
