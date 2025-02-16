package ru.aston.adod_mu.task2;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    @Test
    public void arrayListTest(){
        List<Integer> arr1 = new ArrayList<>(); //empty
        List<Integer> arr2 = new ArrayList<>(10);
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        assertEquals(List.of(1,2,3,4,5), arr3);
    }

    @Test
    public void HashMapTest(){
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("first", 1);
        map1.put("third", 3);
        map1.put(null, 3);
        map1.put(null, null);
        Map<String, Integer> map2 = new HashMap<>(10);
        map2.put("first", 1);
        map2.put("third", 3);
        map2.put(null, null);
        assertEquals(map2, map1);
    }

    @Test
    public void HashMapCollectorsTest(){
        Map<String, Integer> map1 = Stream.of("hello", "I", "am", "Mikhail")
                .collect(Collectors.toMap(
                        s -> s,
                        String::length
                ));
        assertEquals(Map.of("hello", 5, "I", 1, "am", 2, "Mikhail", 7), map1);

    }

    @Test
    public void TreeSetTest(){
        Set<Integer> set1 = new TreeSet<>(Set.of(1,7,5,3,8,0));
        assertEquals(Set.of(0,1,3,5,7,8), set1);
    }
}
