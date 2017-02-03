package com.github.zjiajun.adult.connection;

import okhttp3.Cookie;
import okhttp3.HttpUrl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhujiajun
 * @since 2017/2/3
 */
public class DefaultCookieStore implements CookieStore {

    private final Map<HttpUrl,List<Cookie>> memoryStore = new HashMap<>();
    private final static Path COOKIE_FILE = Paths.get("/Users/zhujiajun/Documents/cookie");

    @Override
    public void store(HttpUrl httpUrl, List<Cookie> list) {
        memoryStore.put(httpUrl,list);
        list.forEach(cookie -> {
            try {
                Files.write(COOKIE_FILE, (cookie.toString()+"\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public List<Cookie> lookup(HttpUrl httpUrl) {
        List<Cookie> cookies = memoryStore.get(httpUrl);
        if (cookies == null) {
            List<Cookie> fileCookie = new ArrayList<>();
            try {
                if (COOKIE_FILE.toFile().exists()) {
                    List<String> lines = Files.readAllLines(COOKIE_FILE);
                    lines.forEach(cookie -> {
                        Cookie parse = Cookie.parse(httpUrl, cookie);
                        System.out.println(parse);
                        fileCookie.add(parse);
                    });
                } else {
                    COOKIE_FILE.toFile().createNewFile();
                }
                cookies = fileCookie;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return cookies;
    }

}
