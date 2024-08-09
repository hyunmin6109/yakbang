package com.example.yakbang.mapper.member;

import com.example.yakbang.dto.member.MemberJoinDTO;
import com.example.yakbang.dto.member.MemberMypageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface MemberMapper {
//    회원가입
    void insertMember(MemberJoinDTO memberJoinDTO);

//    로그인
    Optional<Long> selectMemberId(@Param("loginId") String loginId,
                                  @Param("password") String password);
    // 아이디 중복 검사
    int selectLoginIdCount(String loginId);

//    회원의 정보 마이페이지에서 조회
    Optional<MemberMypageDTO> selectMemberInfo(Long memberId);

//    마이페이지 정보수정
    void updateMemberInfo(MemberMypageDTO memberMypageDTO);

//    회원 정보 삭제
    void deleteMemberInfo(Long memberId);
}
