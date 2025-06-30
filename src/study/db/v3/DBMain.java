package study.db.v3;

import java.time.LocalDateTime;
import java.util.List;

import study.db.v2.Dept;

public class DBMain {

	public static void main(String[] args) {

		DeptDAO deptDAO = new DeptDAO();
		
		ProductDAO productDAO = new ProductDAO();
		
		Dept d = deptDAO.findDeptByDeptno(30);
		System.out.println(d);
		
		List<Dept> dList = deptDAO.findDeptList();
		for(Dept dt : dList) {
			System.out.println(dt);
		}
		
		List<ProductDTO> pList = productDAO.findProductList();
		for(ProductDTO pd : pList) {
			System.out.println(pd);
		}
		
		/* 더이상 save되지 않게 잠시 주석~
		int rs1 = deptDAO.saveDept(50, "Manage", "Seoul");	//개별적 전달
		if(rs1 > 0) {
			System.out.println("저장 성공~");
		}
		
		Dept newSaveDept = new Dept();
		newSaveDept.setDeptno(60);
		newSaveDept.setDname("Design");
		newSaveDept.setLoc("Busan");
		
		int rs2 = deptDAO.saveDept(newSaveDept);	//dept에 저장할 값을 객체단위로 넘겨줌
		if(rs2 > 0) {
			System.out.println("저장 성공~");
		}
		*/
		
		int rs3= deptDAO.removeDept(50);
		if(rs3 > 0) {
			System.out.println("삭제 성공~ rs3값 : " + rs3);
		}
		
		//Dept mdDept = new Dept(60, "Design", "Busan");
		Dept mdDept = deptDAO.findDeptByDeptno(60);	//원본 데이터 조회 -> findDeptByDeptno에서 테이블 이름 변경해줘야함
		
		//수정될 데이터로 변경
		//mdDept.setDname("DesignUI");
		mdDept.setLoc("Ulsan");
		
		int rs4 = deptDAO.modifyDept(mdDept);
		if(rs4 > 0) {
			System.out.println("수정 잘 됨!");
		}
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		Professor p = professorDAO.findProfessorByProfno(2002);
		if(p != null) {
			System.out.println(p);
		}
		
//		Professor saveP = new Professor(9091, "name", "id", "position", 111, LocalDateTime.now(),
//										100, 50, "email", "hpage");
		
		Professor saveP = new Professor(9991, "name", "id", "position", 111, "2025-06-01",
										100, 50, "email", "hpage");
				
		int rs5 = professorDAO.saveProfessor(saveP);
		if(rs5 > 0) {
			System.out.println("saveP 잘 저장됨!");
		}
									
		
	}

}
