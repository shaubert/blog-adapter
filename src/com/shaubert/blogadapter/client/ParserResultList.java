
package com.shaubert.blogadapter.client;

import java.util.List;

public class ParserResultList<T> implements ParserResult {

    private List<T> result;

    public ParserResultList() {
        super();
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

}
