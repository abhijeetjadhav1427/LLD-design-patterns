package designpattern.builder;

public class BuilderPattern {
	public static void main(String[] args) {
		UrlBuilder.Builder builder = new UrlBuilder.Builder();
		builder.protocol("https://").hostname("localhost").port(":8080/").pathParam("abc");
		
		UrlBuilder url = builder.getUrl();
		
		System.out.println(url.protocol+url.hostname+url.port+url.pathParam);
	}
}
