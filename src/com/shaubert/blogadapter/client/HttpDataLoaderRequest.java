package com.shaubert.blogadapter.client;

public class HttpDataLoaderRequest implements DataLoaderRequest {

	public enum HttpMethod {
		POST, GET
	}
	
    private String url;
    private HttpMethod httpMethod = HttpMethod.GET;
    private byte[] entity;
    private String entityMineType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

	public byte[] getEntity() {
		return entity;
	}

	public void setEntity(byte[] entity) {
		this.entity = entity;
	}

	public String getEntityMineType() {
		return entityMineType;
	}

	public void setEntityMineType(String entityMineType) {
		this.entityMineType = entityMineType;
	}
    
}