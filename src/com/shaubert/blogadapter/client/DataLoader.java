package com.shaubert.blogadapter.client;

import java.io.IOException;
import java.io.InputStream;

public interface DataLoader {
    
     InputStream load(DataLoaderRequest request) throws IOException;
    
}
