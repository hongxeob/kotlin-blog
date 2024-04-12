package org.example.kotlinblog.domain.member

data class MemberSaveReq(
    val email: String,
    val password: String,
    val role: Role
) {
    companion object {
        fun from(memberSaveReq: MemberSaveReq): Member {
            return Member(
                memberSaveReq.email,
                memberSaveReq.password,
                memberSaveReq.role
            )
        }
    }
}

data class MemberRes(
    val id: Long?,
    val email: String,
    val password: String,
    val role: Role
) {
    companion object {
        fun from(member: Member): MemberRes {
            return MemberRes(
                id = member.id,
                email = member.email,
                password = member.password,
                role = member.role
            )
        }
    }
}
