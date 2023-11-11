package com.shakil.exampleqrcodescanner.di

import com.shakil.exampleqrcodescanner.data.repo.MainRepoImpl
import com.shakil.exampleqrcodescanner.domain.repo.MainRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindMainRepo(
        mainRepoImpl: MainRepoImpl
    ): MainRepo
}