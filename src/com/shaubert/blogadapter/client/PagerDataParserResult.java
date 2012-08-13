package com.shaubert.blogadapter.client;


public class PagerDataParserResult<T> extends ParserResultList<T> {

    private DataLoaderRequest nextDataRequest;
    
    public DataLoaderRequest getNextDataRequest() {
        return nextDataRequest;
    }
    
    public void setNextDataRequest(DataLoaderRequest nextDataRequest) {
        this.nextDataRequest = nextDataRequest;
    }
    
}
