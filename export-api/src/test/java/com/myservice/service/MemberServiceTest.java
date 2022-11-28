package com.myservice.service;

import static org.junit.jupiter.api.Assertions.*;

import com.myservice.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberServiceTest {

  @Autowired
  private MemberService memberService;

  @Test
  void signup() {
    Member member = new Member("jojoldu", "jojoldu@gmail.com");
    Long id = memberService.signup(member);
    Assertions.assertEquals(id, 1L);
  }
}