package com.bba.catapp.beans;

public class Cat {
    private String name;
    private String description;
    private String searchKeywords;
    private String imageUrl;

    public Cat(String name, String description, String searchKeywords) {
        this.name = name;
        this.description = description;
        this.searchKeywords = searchKeywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    @Override
    public String toString() {
        return  "" + name + '\'' +
                ", " + description + '\'' +
                ", " + searchKeywords + '\'' +
                ", '" + imageUrl + '\'';
    }
}
