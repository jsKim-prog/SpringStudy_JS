package net.jscode.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO { //Todo는 일과표
	private String title; //제목(할 일)
	@DateTimeFormat(pattern = "yyyy/MM/dd")  //@InitBinder 사용안함
	private Date dueDate; //적용 시간
	private boolean check; //성공여부

}
