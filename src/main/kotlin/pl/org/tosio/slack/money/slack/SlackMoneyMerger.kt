package pl.org.tosio.slack.money.slack

import pl.org.tosio.slack.money.money.AddDto
import pl.org.tosio.slack.money.slack.parser.AddSingleArgument

interface SlackMoneyMerger {
    /**
     * Merge payments for same user into single payment and return as AddDto
     */
    fun mergeUserIntoSequence(payments: List<AddSingleArgument>, from: String, description: String?): Sequence<AddDto>
}

