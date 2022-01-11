package com.example.foody.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSources: RemoteDataSources
) {
    val remote = remoteDataSources
}