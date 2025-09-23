package com.hxl.Optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        User user1 = new User("hxl", 18);
        Optional<User> user = Optional.ofNullable(user1);
        System.out.println("user = " + user);

        User user2 = new User(null, null);
        user = Optional.of(user2);
        System.out.println("user = " + user);

        user = Optional.ofNullable(user2);
        System.out.println("user = " + user2);

        Optional<Object> empty = Optional.empty();
        System.out.println("empty = " + empty);
    }
}
