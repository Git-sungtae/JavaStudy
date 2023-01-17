package java_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _10_2 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			System.out.println((list.stream().collect(Collectors.averagingInt(el -> el))).intValue());
			
			Stream<Integer> sortedStream = 
					list.stream()
						.sorted();
			
			List<Integer> sortedList = sortedStream.collect(Collectors.toList());
			System.out.println(sortedList.get(sortedList.size() / 2));
			
	}

}
