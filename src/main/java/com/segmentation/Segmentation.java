package com.segmentation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Segmentation {

	static List<List<Integer>> segmentation(List<Integer> listActif, int taille) {
		if (listActif == null || listActif.isEmpty() || taille == 0) {
			return new ArrayList<>();
		}
		return IntStream.range(0, listActif.size()).boxed()
				.collect(Collectors.groupingBy(partition -> (partition / taille),
						Collectors.mapping(elementIndex -> listActif.get(elementIndex), Collectors.toList())))
				.values().stream().collect(Collectors.toList());
	}

}