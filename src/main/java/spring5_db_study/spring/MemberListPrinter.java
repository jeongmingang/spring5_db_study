package spring5_db_study.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrinter {
	//세터메서드를 사용해서 의존 주입을 하지 않더라도 스프링컨테이너가 @Autowired를 붙인 필드에
	//자동으로 해당 타입의 빈 객체를 주입(필드 생성자도 생략 가능)
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter printer;
	
//	public MemberListPrinter() {
//		
//	}
//	
//	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
//		this.memberDao = memberDao;
//		this.printer = printer;
//	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}

