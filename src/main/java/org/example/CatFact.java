package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public CatFact(@JsonProperty("id") String id,
                   @JsonProperty("text") String text,
                   @JsonProperty("type") String type,
                   @JsonProperty("user") String user,
                   @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public CatFact setId(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public CatFact setText(String text) {
        this.text = text;
        return this;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public CatFact setType(String type) {
        this.type = type;
        return this;
    }

    public CatFact setUser(String user) {
        this.user = user;
        return this;
    }

    public CatFact setUpvotes(int upvotes) {
        this.upvotes = upvotes;
        return this;
    }

    @Override
    public String toString() {
        return "<" + id + ", \n" + text + ", \n" + type + ", \n" + user + ", \n" + upvotes + ".>\n\n";
    }
}
