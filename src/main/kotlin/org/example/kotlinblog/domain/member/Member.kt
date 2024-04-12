package org.example.kotlinblog.domain.member

import jakarta.persistence.*
import org.example.kotlinblog.domain.AuditingEntity

@Entity
@Table(name = "members")
class Member(
    email: String,
    password: String,
    role: Role

) : AuditingEntity() {

    @Column(nullable = false)
    var email = email
        protected set

    var password = password
        protected set

    @Enumerated(EnumType.STRING)
    var role = role
        protected set
}
