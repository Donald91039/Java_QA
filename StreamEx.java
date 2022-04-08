package com.qa.main.stream;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		List<String> result = names.stream().filter(s->s != "James").collect(Collectors.toList());
		result.forEach(value -> System.out.println("Hello " + value));
		
		
		List<Integer> numbers = Arrays.asList(3,4,7,8,12);
		int product = numbers.stream().map(x-> x*x ).reduce(0,(ans,i)-> ans+i);
		 System.out.println("Product "+product);
		 
		 
		 List<Integer> numbers2 = Arrays.asList(3,4,7,8,12);
		 
		 Optional<Integer> minNumber = numbers2.stream().min((i, j) -> i.compareTo(j));
		 System.out.println("Min "+ minNumber.get());
		 
		 Optional<Integer> maxNumber = numbers2.stream().max((i, j) -> i.compareTo(j));
		 System.out.println("Max "+ maxNumber.get());
		 
		 List<Integer>  oddNumbers = numbers2.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
		 oddNumbers.forEach(value -> System.out.println("odd " + value));
		 
		 List<Integer>  evenNumbers = numbers2.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		 evenNumbers.forEach(value -> System.out.println("even " + value));
		 
		 System.out.println("Sum of ArrayList Integers: " + numbers2.stream().mapToInt(i -> i).sum());
		 
		 Set<Integer> squareSet = numbers2.stream().map(x->x*x).collect(Collectors.toSet());
		 List<Integer> oddSquNumbers = squareSet.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
		 Optional<Integer> minOddSquNum = oddSquNumbers.stream().min((i, j) -> i.compareTo(j));
		 System.out.println("Min odd Square Number "+ minOddSquNum.get());
		 
		
	}

		
}
