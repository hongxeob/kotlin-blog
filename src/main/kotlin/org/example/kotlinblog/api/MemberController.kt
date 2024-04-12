package org.example.kotlinblog.api

import org.example.kotlinblog.service.MemberService
import org.example.kotlinblog.util.CmResDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val memberService: MemberService
) {

    @GetMapping
    fun findAll(): CmResDto<*> {
        return CmResDto(HttpStatus.OK, "OK", memberService.findAll())
    }
}
