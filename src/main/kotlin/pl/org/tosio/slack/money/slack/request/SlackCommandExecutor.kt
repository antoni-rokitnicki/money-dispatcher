package pl.org.tosio.slack.money.slack.request


interface SlackCommandExecutor {
    fun <P : SlackParameter, R : Any> send(command: SlackCommand<P, R>): R
}
