package com.chen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
请将 words.txt 文件放到 D 盘点根目录下，即文件的路径为 `D:/words.txt`，
文件中的内容每行都是以空格分隔的多个单词，请读取该文件中的内容，统计每个单词出现的次数。
输出顺序不限，请以单词以及出现的次数输出：
 */
public class Word {
    public static void main(String[] args) throws IOException {
        //读入文档
        BufferedReader read = new BufferedReader(new FileReader("D:\\words.txt"));
        String line;
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        while ((line = read.readLine()) != null) {
            //切下来放在里面
            String[] s = line.split(" ");

            //遍历
            for (int i = 0; i < s.length; i++) {
                if (map.containsKey(s[i])) {
                    map.put(s[i], map.get(s[i]) + 1);
                } else {
                    map.put(s[i], 1);
                }
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

        //关闭流
    }
}
