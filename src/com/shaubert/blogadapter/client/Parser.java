package com.shaubert.blogadapter.client;

import java.io.IOException;
import java.io.InputStream;

public interface Parser {

    <T extends ParserResult> T parse(DataLoaderRequest request, InputStream inputStream) throws IOException;
    
}