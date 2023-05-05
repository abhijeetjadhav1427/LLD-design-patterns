package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {
	private static final Map<String, Ball> cache = new HashMap<>();
	
	public static Ball getBall(String color, String imageUrl) {
		StringBuilder sb = new StringBuilder();
		sb.append(color);
		sb.append(imageUrl);
		String key = sb.toString();
		Ball ball = cache.getOrDefault(key, null);
		
		if(ball == null) {
			ball = new Ball(color, imageUrl);
			cache.put(key, ball);
			System.out.println("Creating circle of color : " + color);
		}
		
		return ball;
	}
}
