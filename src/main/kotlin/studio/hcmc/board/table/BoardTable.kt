package studio.hcmc.board.table

import org.jetbrains.exposed.dao.id.LongIdTable
import studio.hcmc.exposed.table.create
import studio.hcmc.exposed.table.varchar

object BoardTable : LongIdTable() {
    val name by varchar(20) { uniqueIndex() }

    init {
        create()
    }
}