package com.tairan.mybatisdemo.test;

import org.apache.xmlbeans.impl.regex.Match;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ding on 2017/7/24.
 */
public class NewTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().replaceAll("\\-", ""));

        String pattern = "[\\s\\S]+[a-z]+234";
        Pattern pattern1 = Pattern.compile(pattern);
        String str ="11a234";
        System.out.println(str.matches(pattern));

        Matcher match = pattern1.matcher(str);
        System.out.println(match.find());

        String rex = "\\#\\{\\s*\\S*\\s*}";
        String string = "#{werwert   }sffdf#{F#@$t3 }fgergr#{   }";
        System.out.println(string.replaceAll(rex,"?"));

        String phone = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        System.out.println("15957191904@qwe.com".matches(phone));
    }


}
