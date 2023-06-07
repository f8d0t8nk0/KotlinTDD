package tv.codealong.newboston.service

import org.springframework.stereotype.Service
import tv.codealong.newboston.datasource.BankDataSource
import tv.codealong.newboston.model.Bank

@Service
class BankService(private val bankDataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return bankDataSource.retrieveBanks()
    }
}