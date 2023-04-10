package ehsun7b.coolio.entity

import java.util.UUID

case class Entry(
    id: UUID,
    name: String,
    password: String,
    url: Option[String],
    note: Option[String],
    icon: Option[Char]
)
