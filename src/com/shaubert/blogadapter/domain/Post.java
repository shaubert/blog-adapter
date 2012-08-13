package com.shaubert.blogadapter.domain;


public class Post {

    private String title;
    private String message;
    private String[] imageUrls;
    private String creationDate;
    private String author;
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String[] getImageUrls() {
        return imageUrls;
    }
    
    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }
    
    public String getCreationDate() {
        return creationDate;
    }
    
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
        
}
