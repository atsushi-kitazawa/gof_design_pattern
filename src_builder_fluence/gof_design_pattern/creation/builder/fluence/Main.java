package gof_design_pattern.creation.builder.fluence;

public class Main {
	public static void main(String[] args) {
		HttpRequestBuilder request = new HttpRequestBuilder().method("GET")
				.version("1.1").resource("index.html")
				.headers("Content-Type", "text/html").body(null);
		System.out.println(request);
	}
}
