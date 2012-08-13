package com.shaubert.blogadapter.domain;


public class Comment extends Post {
    
    private Post topic;
    private Comment inReplyTo;
    
    public Post getTopic() {
        return topic;
    }
    
    public void setTopic(Post topic) {
        this.topic = topic;
    }
    
    public Comment getInReplyTo() {
        return inReplyTo;
    }
    
    public void setInReplyTo(Comment inReplyTo) {
        this.inReplyTo = inReplyTo;
    }
    
}
