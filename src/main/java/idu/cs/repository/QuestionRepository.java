package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.entity.QuestionEntity;
import idu.cs.entity.UserEntity;

public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> {
	
	/*
	UserEntity findByUserId(String questionId); // id : 자동증가번호, userId : 회원가입 아이디
	List<QuestionEntity> findByName(String name);
	List<QuestionEntity> findByNameOrderByIdAsc(String name);
	List<QuestionEntity> findByCompany(String company);
	*/
}
