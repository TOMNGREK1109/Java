package Mondai1;
import java.util.List;

import JAVA.UTIL.*;

public class Sample1_2 {
    public static void main(String[] args) {
        
         static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(0); list.add(1); print("要素を追加：",list);
            list.add(1,2); print("要素を挿入：", list);
            list.remove(1); print("要素を削除：",list);
            list.set(0,10); print("要素を変更：",list);
            int index = list.indexOf(10);
            System.out.println("要素の検索：" + index);
            boolean chk = list.contains(10);
            System.out.println("要素の確認： + chk");
            int indexNUm = list.size();
            System.out.println("要 素 数：" + indexNUm);
        }
        
    }
}
