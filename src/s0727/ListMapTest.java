package s0727;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapTest {

	public static void main(String[] args) {
		List<Map<String, Object>> personList = new ArrayList<>();
		Map<String, Object> person = new HashMap<>();
		person.put("name", "동동이");
		person.put("지역", "서울");
		person.put("전번", "444-1234");
		personList.add(person);
		person = new HashMap<>();
		person.put("name", "나비");
		person.put("지역", "경기");
		person.put("전번", "123-1234");
		personList.add(person);
		person = new HashMap<>();
		person.put("name", "춘삼이");
		person.put("지역", "대구");
		person.put("전번", "555-1234");
		personList.add(person);

		List<Map<String, Object>> phoneList = new ArrayList<>();
		Map<String, Object> phone = new HashMap<>();
		phone.put("지역", "서울");
		phone.put("국번", "02");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "부산");
		phone.put("국번", "051");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "대구");
		phone.put("국번", "053");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "인천");
		phone.put("국번", "032");
		phoneList.add(phone);
		phone = new HashMap<>();
		phone.put("지역", "경기");
		phone.put("국번", "031");
		phoneList.add(phone);

		for (Map<String, Object> p : personList) {
			System.out.println(p);
			for (Map<String, Object> ph : phoneList) {
				if (p.get("지역").equals(ph.get("지역"))) {
					p.put("전번", ph.get("국번")+ "-" + p.get("전번"));
				}
			}
					System.out.println(p);

				}

			}
	}


