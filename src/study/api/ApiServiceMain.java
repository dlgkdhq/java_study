package study.api;

public class ApiServiceMain {

	public static void main(String[] args) {
		// Service 구조로 만들어진 객체를 활용하는 메인
		
		// 공공데이터 API 와 데이터 통신하는 객체
		MidFcstInfoService mService = new MidFcstInfoService();	 //DAO 쓰듯이
		
		// API service를 통해서 데이터를 획득, 그 데이터가 DTO에 담겨있음
		//MidTaDTO mtDTO = mService.findMidTa("202507030600", "11C20301"); //천안
		//MidTaDTO mtDTO = mService.findMidTa("202507030600", "11B10101"); //서울
		MidTaDTO mtDTO = mService.findMidTa("202507030600", "11B20201"); //인천
		
		System.out.println(mtDTO);
		
		// 그 DTO 객체를 DB에 저장
		MidFcstDAO mfDAO = new MidFcstDAO();
		
		int result = mfDAO.saveMidTa(mtDTO);
		if(result > 0) {
			System.out.println("저장 성공~");
		}
	}

}
