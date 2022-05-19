package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListTask {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
//		Set s= new TreeSet();//----------------list to set
//		s.addAll(li);
//		System.out.println(s);
//		int size = li.size();
//		System.out.println(size);
//		Object Object  = li.get(li.size()-1);//------------lastindexof
//		System.out.println(Object);
//		Object Object1 = li.get(0);//------------1stindexof
//		System.out.println(Object1);
//		Object Object2  = li.get(li.size()-5);//------------last 5 indexof
//		System.out.println(Object2);
//		Object Object3  = li.get(li.size()/2);//------------mid indexof
//		System.out.println(Object3);
//		for (Object object : li) {//-------------each for loop
//			System.out.println(object);
//		}
		for (int i = 0; i < li.size(); i++) {//----------------forloop
			Object object = li.get(i);
			System.out.println(object);
		}
	}	
}