package com.segmentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.segmentation.Segmentation;

public class SegmentationTest {

	@Test
	public void testSegmentationWithListNullAndTailleZero() {
		List<List<Integer>> result = Segmentation.segmentation(null, 0);
		assertEquals(0, result.size());
	}

	@Test
	public void testSegmentationWithListNullAndTailleNotZero() {
		List<List<Integer>> result = Segmentation.segmentation(null, 9);
		assertEquals(0, result.size());
	}

	@Test
	public void testSegmentationWithListNotNullAndTailleZero() {
		List<List<Integer>> result = Segmentation.segmentation(new ArrayList<>(), 0);
		assertEquals(0, result.size());
	}

	@Test
	public void testSegmentationTaille2() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 6, 8, 9));
		List<List<Integer>> result = Segmentation.segmentation(list, 2);
		assertEquals(3, result.size());
		assertTrue(result.get(0).get(0) == 1);
		assertTrue(result.get(0).get(1) == 5);
		assertTrue(result.get(1).get(0) == 6);
		assertTrue(result.get(1).get(1) == 8);
		assertTrue(result.get(2).get(0) == 9);
	}

	@Test
	public void testSegmentationTaille3() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 6, 8, 9));
		List<List<Integer>> result = Segmentation.segmentation(list, 3);
		assertEquals(2, result.size());
		assertTrue(result.get(0).get(0) == 1);
		assertTrue(result.get(0).get(1) == 5);
		assertTrue(result.get(0).get(2) == 6);
		assertTrue(result.get(1).get(0) == 8);
		assertTrue(result.get(1).get(1) == 9);
	}

	@Test
	public void testSegmentationTaille1() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 6, 8, 9));
		List<List<Integer>> result = Segmentation.segmentation(list, 1);
		assertEquals(5, result.size());
		assertTrue(result.get(0).get(0) == 1);
		assertTrue(result.get(1).get(0) == 5);
		assertTrue(result.get(2).get(0) == 6);
		assertTrue(result.get(3).get(0) == 8);
		assertTrue(result.get(4).get(0) == 9);
	}

}
