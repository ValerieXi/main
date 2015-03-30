package com.valerie.file;

import com.valerie.util.UnicodeUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by valerie on 15/3/30
 */
public class FileIO {
    private static List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        read();
        write();
        System.exit(0);
    }

    private static void read(){
        File file = new File("/Users/valerie/Documents/aaa");
        BufferedReader reader = null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                String list1 = "line " + line + ": content-" + tempString;
                String list2 = "line " + line + ": content-" + UnicodeUtil.toUnicode(tempString);
                list.add(list1);
                list.add(list2);
                System.out.println(list1);
                System.out.println(list2);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    private static void write(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/Users/valerie/Documents/write");
            for (String a : list) {
                fileWriter.write(a + "\n");
            }


            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("over");
        }
    }
}
