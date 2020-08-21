package cn.tudu.d15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test4_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(9527, "唐伯虎");
		hashMap.clear();
		hashMap.isEmpty();
		hashMap.put(9527, "唐伯虎");
		hashMap.put(9528, "秋香");// 改值
		hashMap.put(9528, "如花");
		hashMap.put(9529, "秋香1");// 改值
		hashMap.put(9530, "秋香2");// 改值
		System.out.println(hashMap.containsKey(9528));
		System.out.println(hashMap.containsValue("秋香"));
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> item : entrySet) {
			System.out.println(item);
		}
		Set<Integer> keys = hashMap.keySet();
		Collection<String> values = hashMap.values();
		for (String item : values) {
			System.out.println("v = " + item);
		}
//		Iterator<Integer> it = keys.iterator();
		for (Integer item : keys) {
			System.out.println(item);
		}
//		while(it.hasNext()) {
//			System.out.println(hashMap.get(it.next()));
//		}
		hashMap.remove(9529);

	}
}
