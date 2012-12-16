package com.shaubert.blogadapter.client;

import com.shaubert.blogadapter.domain.Post;

public class Blog {

    protected DataLoader dataLoader;
    protected RequestProvider requestProvider;
    protected final ParserFactory parserFactory;
    
    public Blog(DataLoader dataLoader, ParserFactory parserFactory, RequestProvider requestProvider) {
        this.dataLoader = dataLoader;
        this.parserFactory = parserFactory;
        this.requestProvider = requestProvider;
    }

    public <T extends Post> Pager<T> createPager() {
        return new Pager<T>(dataLoader, parserFactory.createPostParser(), requestProvider.createRequestForPosts());
    }
    
    public <T extends Post> Pager<T> createPager(DataLoaderRequest request) {
        PagerDataParserResult<T> result = new PagerDataParserResult<T>();
        result.setNextDataRequest(request);
        return new Pager<T>(dataLoader, parserFactory.createPostParser(), result);
    }
    
    public <T extends Post> Pager<T> createPager(Post forPost) {
        return new Pager<T>(dataLoader, parserFactory.createCommentsParser(), requestProvider.createRequestForComments(forPost));
    }
    
}
