package bai_11.bai_tap.dem_so_lan_xuat_hien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfWordAppearance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kì: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String s: arr){
            if (map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            }else {
                map.put(s, 1);
            }
        }
        System.out.println(map.toString());
    }
}
