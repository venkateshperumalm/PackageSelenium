package com.packageselenium.collectionexcercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		List<String> aL = Arrays.asList("abv","chd","cha");
		List<String> linkedList = convertToLinkedList(aL);
		System.out.println(linkedList);
	}

	public static <T> List<T> convertToLinkedList(List<T> aL){
		return aL
				.stream()
				.collect(Collectors.toCollection(LinkedList::new));
	}
}
