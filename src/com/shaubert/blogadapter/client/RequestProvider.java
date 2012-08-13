package com.shaubert.blogadapter.client;

import com.shaubert.blogadapter.domain.Post;

public interface RequestProvider {

    DataLoaderRequest createRequestForPosts();
    
    DataLoaderRequest createRequestForComments(Post post);
    
}
