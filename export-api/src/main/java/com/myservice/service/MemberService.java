package com.myservice.service;

import com.myservice.domain.Member;
import com.myservice.domain.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
  private MemberRepository memberRepository;

  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  public Long signup (Member member){
    return memberRepository.save(member).getId();
  }
}
