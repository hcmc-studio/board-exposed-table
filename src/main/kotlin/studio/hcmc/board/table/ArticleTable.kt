package studio.hcmc.board.table

import kotlinx.datetime.Clock
import org.jetbrains.exposed.dao.id.LongIdTable
import studio.hcmc.exposed.table.*

object ArticleTable : LongIdTable() {
    val boardId by reference(BoardTable.id)
    val title by varchar(200)
    val body by varchar(2000)
    val writerNickname by varchar(20)
    val writerPassword by varchar(192)
    val writerAddress by varchar(15)
    val writtenAt by timestamp { clientDefault { Clock.System.now() } }
    val lastModifiedAt by timestamp().nullable()

    init {
        create()
    }
}