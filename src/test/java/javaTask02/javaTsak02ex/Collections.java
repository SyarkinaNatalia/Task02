package javaTask02.javaTsak02ex;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0]=1;
        nums[1]=1;
        nums[2]=1;
        try {
            nums[1]=1;
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("UPS!!!!");
        }
        System.out.println(nums[1]);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


        String[] str = {"24","42","81","11","2","4"};
        System.out.println(str[2]);
        Arrays.stream(str)
                .filter(s -> s.contains("4"))
                .forEach(s -> System.out.println("contains = " + s));


        ArrayList<String> list = new ArrayList<>();
        list.add("Looo");
        list.add("AAa456546");
        list.add("Boooo");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (String s : list){
            System.out.println("ForEach = " + s.length());
        }
        list.forEach(s -> System.out.println("strim = " + s));
        list.stream()
                .filter(s -> s.length()<8)
                .forEach(s -> System.out.println("filter = " + s));
        list.stream()
                .filter(s -> s.contains("A"))
                .forEach(s -> System.out.println("contains = " + s));

        ArrayList<String> secondList = (ArrayList<String>) list.stream().
                filter(s -> s.length()<8).
                collect(Collectors.toList());
        secondList.forEach(s -> System.out.println("second list item = " + s));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1346554);
        list1.add(23);
        list1.add(653);
        list1.add(2);
        list1.stream()
                .filter(s -> s>100)
                .forEach(s -> System.out.println("Integer filter = " + s));

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("Key1","Value1");
        map1.put("Key2","Value1");
        map1.put("Key3","Value1");
        map1.put("Key4","Value1");
        map1.put("Key1","Перезапись");
        System.out.println(map1.get("Key1"));
        Set<String> set;
        set = map1.keySet();
        set.forEach(s -> System.out.println("keys = " + s));

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Оли", 1);
        map2.put("Биг",8);
        map2.put("Гоша",3);
        Set<String> set2;
        set2 = map2.keySet();
        set2.stream().filter(s -> s.length()>3).forEach(s -> System.out.println("Имя больше 3х букв = " + s));
        int value = map2.get("Оли");
        map2.put("Оли", value + 3);
        System.out.println("У Оли стало " + map2.get("Оли"));
    }
}

