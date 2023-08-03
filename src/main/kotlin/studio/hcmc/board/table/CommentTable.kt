package studio.hcmc.board.table

import kotlinx.datetime.Clock
import org.jetbrains.exposed.dao.id.LongIdTable
import studio.hcmc.exposed.table.*

object CommentTable : LongIdTable() {
    val articleId by reference(ArticleTable.id)
    val body by varchar(200)
    val writerNickname by varchar(20)
    val writerPassword by varchar(128)
    val writerAddress by varchar(15)
    val writtenAt by timestamp { clientDefault { Clock.System.now() } }
    val lastModifiedAt by timestamp().nullable()
}