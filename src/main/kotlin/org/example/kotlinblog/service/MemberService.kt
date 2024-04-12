package org.example.kotlinblog.service

import org.example.kotlinblog.domain.member.MemberRepository
import org.example.kotlinblog.domain.member.MemberRes
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberService(
    private val memberRepository: MemberRepository
) {

    fun findAll(): List<MemberRes> {
        return memberRepository.findAll().map { MemberRes.from(it) }
    }
}
