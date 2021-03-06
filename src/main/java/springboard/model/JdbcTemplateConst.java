package springboard.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateConst {

	/*
	 Spring 프로젝트 전체에서 해당 변수를 사용하기 위해 static타입으로
	 생성한다.
	 static타입의 변수는 프로그램 내에서만 딱 하나 생성되고,
	 객체 생성 없이 클래스명으로 직접 접근할 수 있는 공유 객체가 된다.  
	 */
	public static JdbcTemplate template;
}
