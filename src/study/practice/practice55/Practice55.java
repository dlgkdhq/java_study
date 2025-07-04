package study.practice.practice55;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice55 {

	public static void main(String[] args) throws Exception {
		String jsonText = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}";
		
		JSONParser jsonParser = new JSONParser();	//JSON 포맷 최초 변환해주는 역할
		JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonText);
		
		JSONArray employees = (JSONArray)jsonObj.get("employees");
		for(int i=0; i<employees.size(); i++) {
			JSONObject list = (JSONObject) employees.get(i);
			System.out.println(list.get("id"));
			System.out.println(list.get("name"));
			System.out.println(list.get("position"));
			System.out.println(list.get("salary"));
			
			JSONArray skills = (JSONArray)list.get("skills");
			for(int j=0; j<skills.size(); j++) {
				System.out.print(skills.get(j) + " ");
			}
			System.out.println();
		}
		
		JSONObject company = (JSONObject)jsonObj.get("company");
		System.out.println(company.get("name"));
		System.out.println(company.get("address"));
		System.out.println(company.get("established"));
		
		JSONArray departments = (JSONArray)company.get("departments");
		for(int i=0; i<departments.size(); i++) {
			JSONObject dplist = (JSONObject) departments.get(i);
			System.out.println(dplist.get("name"));
			
			JSONArray emplist = (JSONArray)dplist.get("employees");
			for(int j=0; j<emplist.size(); j++) {
				System.out.print(emplist.get(j) + " ");
			}
			System.out.println();
		}
		
		JSONArray projects = (JSONArray)jsonObj.get("projects");
		for(int i=0; i<projects.size(); i++) {
			JSONObject plist = (JSONObject) projects.get(i);
			System.out.println(plist.get("title"));
			System.out.println(plist.get("budget"));
			
			JSONArray team = (JSONArray)plist.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.print(team.get(j) + " ");
			}
			System.out.println();
		}

	}

}
