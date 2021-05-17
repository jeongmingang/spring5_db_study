package spring5_db_study.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	//세터메서드를 사용해서 의존 주입을 하지 않더라도 스프링컨테이너가 @Autowired를 붙인 필드에
	//자동으로 해당 타입의 빈 객체를 주입(즉 세터 생략 가능)
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

//	public void setMemberDao(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
//
//	public void setPrinter(MemberPrinter printer) {
//		this.printer = printer;
//	}
}
