package org.example.kotlinblog.domain.post

import jakarta.persistence.*
import org.example.kotlinblog.domain.AuditingEntity
import org.example.kotlinblog.domain.member.Member

@Entity
@Table(name = "posts")
class Post(
    title: String,
    content: String,
    member: Member
) : AuditingEntity() {
    @Column(nullable = false)
    var title = title
        protected set

    var content = content
        protected set

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Member::class)
    var member = member
        protected set
}
