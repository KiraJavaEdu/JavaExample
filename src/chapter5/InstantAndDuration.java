package chapter5;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {
	public static void main(String[] args) {
		Instant start=Instant.now();
		System.out.println(start);
		
		Instant end=Instant.now();	
		System.out.println(end);
		
		Duration elapse=Duration.between(start, end);
		System.out.println(elapse.toMillis());
	}
}

