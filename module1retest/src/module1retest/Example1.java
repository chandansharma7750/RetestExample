package module1retest;

import java.util.*;
import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		String[] cityName = { "gaya", "delhi", "pune" };
		HashMap<String, String> hashMap = new HashMap<>();
		for (int i = 0; i < cityName.length; i++) {
			hashMap.put(cityName[i].toUpperCase().substring(0, 3), cityName[i]);

		}
		System.out.println(hashMap);

	}

}
