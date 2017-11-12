package pl.org.tosio.slack.money.user

import pl.org.tosio.slack.money.graph.UserEntity

interface UserService {
    fun getOrCreate(name: String): UserEntity

    fun cleanAll()

}
