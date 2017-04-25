package org.jjy;

import org.jjy.entity.MemberEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootTemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootTemplateApplication.class, args);
		
		MemberEntity entity = new MemberEntity();
	}
}
