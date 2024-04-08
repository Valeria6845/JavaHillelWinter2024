package org.homework28;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jaiden", 55);
        User user2 = new User("Alex", 10);
        User user3 = new User("Den", 35);
        CacheBox.put("cache1", "key1", user1);
        CacheBox.put("cache2", "key2", user2);
        CacheBox.put("cache1", "key2", user3);
        System.out.println(CacheBox.get("cache1", "key2"));
        System.out.println(CacheBox.isCacheExist("cache2"));
        CacheBox.clear();
        System.out.println(CacheBox.get("cache2", "key2"));
    }
}