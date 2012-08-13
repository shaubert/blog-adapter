package com.shaubert.blogadapter.client;

public interface ParserFactory {

    Parser createPostParser();
    
    Parser createCommentsParser();
    
}
