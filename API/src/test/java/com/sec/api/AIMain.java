package com.sec.api;

import java.util.Scanner;

/*
 * @author:吴杰
 * @data:2021/8/24
 */
public class AIMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        while (true){
            str=sc.next();
            str=str.replace("吗","");
            str=str.replace("？","!");
            System.out.println(str);
        }
    }
}
