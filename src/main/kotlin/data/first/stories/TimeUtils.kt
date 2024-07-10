package data.first.stories.data.first.stories

import kotlinx.datetime.*

object TimeUtils {
    fun LocalDate.toEpochMilisAtStartOfDay(): Long {
        return this.atTime(LocalTime(0, 0, 0)).toInstant(TimeZone.UTC).toEpochMilliseconds()
    }
}