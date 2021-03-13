package gof_design_pattern.creation.builder.fluence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequestBuilder {

	private String method;
	private String version;
	private String resource;
	private List<Map<String, String>> headers = new ArrayList<>();
	private String body;

	public HttpRequestBuilder method(String method) {
		this.method = method;
		return this;
	}

	public HttpRequestBuilder version(String version) {
		this.version = version;
		return this;
	}

	public HttpRequestBuilder resource(String resource) {
		this.resource = resource;
		return this;
	}

	public HttpRequestBuilder headers(String key, String value) {
		Map<String, String> header = new HashMap<>();
		header.put(key, value);
		this.headers.add(header);
		return this;
	}

	public HttpRequestBuilder body(String body) {
		this.body = body;
		return this;
	}

	@Override
	public String toString() {
		return "HttpRequestBuilder [method=" + method + ", version=" + version
				+ ", resource=" + resource + ", headers=" + headers + ", body="
				+ body + "]";
	}

}
