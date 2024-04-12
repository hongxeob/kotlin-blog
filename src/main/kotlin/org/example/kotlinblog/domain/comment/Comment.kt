package org.example.kotlinblog.domain.comment

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.example.kotlinblog.domain.AuditingEntity
import org.example.kotlinblog.domain.post.Post

@Entity
@Table(name = "comments")
class Comment(
    title: String,
    content: String,
    post: Post
) : AuditingEntity() {

    var title = title

    var content = content
        protected set

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Post::class)
    var post = post
        protected set
}
