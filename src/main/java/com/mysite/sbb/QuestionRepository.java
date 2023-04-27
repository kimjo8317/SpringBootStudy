package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository <Question, Integer>//QuestionRepository를 리포지토리로만듬
{

}
