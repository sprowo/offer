package com.prowo.jdk.map;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author prowo
 * @date 2018/1/2
 */
public class MapTest implements Serializable {

    private String name = "ss";
    private transient String age = "20";

    @Override
    public String toString() {
        return "MapTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("name", "linan");
        map.put("sex", "18");


        /*MapTest mapTest = new MapTest();
        System.err.println(mapTest.toString());
        System.err.println(JSON.toJSONString(mapTest));

        try {
            // 序列化，被设置为transient的属性没有被序列化
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
                    "/Users/prowo/Documents/githubRepo/offer/1.txt"));
            o.writeObject(mapTest);
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 重新读取内容
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                    "/Users/prowo/Documents/githubRepo/offer/1.txt"));
            MapTest test = (MapTest) in.readObject();
            // 读取后psw的内容为null
            System.out.println(test.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

}
