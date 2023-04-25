package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Column 애너테이션을 사용하지 않더라도 테이블 컬럼으로 인식한다.
//테이블 컬럼으로 인식하고 싶지 않은 경우에만 @Transient 애너테이션을 사용한다.
public class Question {
    @Id //@Id 고유키로 지정 ,중복X
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue = 1씩 자동증가
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT") //글자 수 제한 없음
    private String content;

    private LocalDateTime CreateDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
