package org.example.kotlinblog.domain.post

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.example.kotlinblog.domain.AuditingEntity

@Entity
@Table(name = "posts")
class Post(
    title: String,
    content: String
) : AuditingEntity() {
    @Column(nullable = false)
    var title = title
        protected set

    var content = content
        protected set
}
