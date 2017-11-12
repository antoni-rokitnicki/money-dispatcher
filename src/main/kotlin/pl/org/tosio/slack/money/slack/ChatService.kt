package pl.org.tosio.slack.money.slack

interface ChatService {
    fun sendMessage(user: String, message: String)
}
