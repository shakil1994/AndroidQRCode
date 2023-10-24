package com.shakil.googleqrcodescanner.domain.repo

import kotlinx.coroutines.flow.Flow

interface MainRepo {
    fun startScanning(): Flow<String?>
}