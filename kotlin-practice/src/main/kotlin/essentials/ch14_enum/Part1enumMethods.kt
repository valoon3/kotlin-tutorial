package essentials.ch14_enum

enum class Part1enumMethods(val day: String) {
    MONDAY("monday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    TUESDAY("tuesday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    WEDNESDAY("wednesday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    THURSDAY("thursday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    FRIDAY("friday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    SATURDAY("saturday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    },
    SUNDAY("sunday") {
        override fun getDayOfTheWeek(): String {
            return day
        }
    }

    ;

    abstract fun getDayOfTheWeek(): String
}