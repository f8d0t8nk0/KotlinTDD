package tv.codealong.newboston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.newboston.datasource.BankDataSource
import tv.codealong.newboston.model.Bank

@Repository
class MockBankDataSource: BankDataSource {

    val bankList = listOf(
        Bank("4321", 2.0, 12 ),
        Bank("1234", 2.0, 0 ),
        Bank("9876", 0.0, 12 ),
    )

    override fun retrieveBanks(): Collection<Bank> = bankList
}