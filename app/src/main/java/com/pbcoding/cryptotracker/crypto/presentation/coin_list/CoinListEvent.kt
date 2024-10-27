package com.pbcoding.cryptotracker.crypto.presentation.coin_list

import com.pbcoding.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}