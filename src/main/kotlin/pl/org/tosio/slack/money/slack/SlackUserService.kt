package pl.org.tosio.slack.money.slack

interface SlackUserService {
    fun getUserChannel(user: String): String

    fun getUserName(user: String): String
}
