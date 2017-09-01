package com.lssdeveloper.pojo.teste;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaArrayComStream {

	public static void main(String[] args) {
		
		String[] array = {"a", "b", "c", "d", "e"};
		
		//Arrays.stream
		Stream<String> stream1 = Arrays.stream(array);
		stream1.forEach(x -> System.out.println(x));
		
		System.out.println("***********************");
		
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(x -> System.out.println(x));
		System.out.println("***********************");
		int[] intArray = {1,2, 3, 4, 5};
		
		//1. Arrays.stream -> IntStream
		IntStream intStream1 = Arrays.stream(intArray);
		intStream1.forEach(x -> System.out.println(x));
		System.out.println("***********************");
		//2. Stream.of
		Stream<int[]> temp =Stream.of(intArray);
		//Não podemos simplesmente imprimir este cara
		//temos que convertê-lo
		IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
		intStream2.forEach(x -> System.out.println(x));

	}

}
