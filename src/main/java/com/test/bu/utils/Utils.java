package com.test.bu.utils;

import com.test.bu.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cagy on 12/6/2017.
 */
public class Utils {
    public static List<String> validate(Users user) {
        List<String> result = new ArrayList<>();
        if (user.getName().length() < 3) {
            result.add("Name too short");
        }
        return result;
    }
}
