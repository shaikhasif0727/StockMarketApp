package com.plcoding.stockmarketapp.presentation.company_listings

sealed class CompanyListingEvent {
    object Refresh: CompanyListingEvent()
    data class OnSeachQueryChange(val query: String): CompanyListingEvent()
}