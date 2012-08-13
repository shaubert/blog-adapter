package com.shaubert.blogadapter.client;

import java.io.IOException;
import java.io.InputStream;

public class HttpDataLoader implements DataLoader {

    private HttpGateway httpGateway;

    public HttpDataLoader(HttpGateway httpGateway) {
        this.httpGateway = httpGateway;
    }
    
    @Override
    public InputStream load(DataLoaderRequest request) throws IOException {
        HttpDataLoaderRequest httpRequest = (HttpDataLoaderRequest)request;
        return httpGateway.loadData(httpRequest.getUrl());
    }

}