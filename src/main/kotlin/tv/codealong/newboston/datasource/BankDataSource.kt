package tv.codealong.newboston.datasource

import tv.codealong.newboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}