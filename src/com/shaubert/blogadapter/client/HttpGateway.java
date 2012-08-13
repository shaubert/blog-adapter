package com.shaubert.blogadapter.client;

import java.io.IOException;
import java.io.InputStream;

public interface HttpGateway {
   
    InputStream loadData(String url) throws IOException;
    
}