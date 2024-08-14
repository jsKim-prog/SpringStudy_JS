package net.jscode.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TimeMapperTests {
	
	@Setter(onMethod_ = @Autowired) //생성자 자동주입
	private TimeMapper timeMapper; 
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName()); //객체 클래스명 로그에 출력
		log.info(timeMapper.getTime()); //select sysdate from dual 쿼리 실행
	}
	
	@Test
	public void testGetTimeXML() {
		log.info(timeMapper.getClass().getName()); //객체 클래스명 로그에 출력
		log.info(timeMapper.getTimeXML()); //인터페이스+xml 매퍼용으로 출력
	}

}
