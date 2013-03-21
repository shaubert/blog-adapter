package com.shaubert.blogadapter.client;

import org.apache.http.cookie.Cookie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HttpDataLoaderRequest implements DataLoaderRequest {

	public enum HttpMethod {
		POST, GET
	}
	
    private String url;
    private HttpMethod httpMethod = HttpMethod.GET;
    private byte[] entity;
    private String entityMimeType;
    private Collection<Cookie> cookies = new ArrayList<Cookie>();
    private Map<String, String> headers = new HashMap<String, String>();

    public void addCookie(Cookie cookie) {
        cookies.add(cookie);
    }

    public void setHeader(String name, String value) {
        headers.put(name, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Collection<Cookie> getCookies() {
        return cookies;
    }

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

	public String getEntityMimeType() {
		return entityMimeType;
	}

	public void setEntityMimeType(String entityMimeType) {
		this.entityMimeType = entityMimeType;
	}

    @Override
    public String toString() {
        return "HttpDataLoaderRequest{" +
                "url='" + url + '\'' +
                ", httpMethod=" + httpMethod +
                (entity != null ? (", with entity of " + entity.length + "b") : "") +
                ", entityMimeType='" + entityMimeType + '\'' +
                ", cookies=" + cookies +
                ", headers=" + headers +
                '}';
    }
}