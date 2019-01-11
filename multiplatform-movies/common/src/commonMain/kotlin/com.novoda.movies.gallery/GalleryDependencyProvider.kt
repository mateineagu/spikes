package com.novoda.movies.gallery

import com.novoda.movies.core.NetworkingDependencyProvider

class GalleryDependencyProvider(private val networkingDependencyProvider: NetworkingDependencyProvider) {

    fun provideGalleryBackend(): GalleryBackend = KtorGalleryBackend(networkingDependencyProvider.provideAuthenticatedClient())

}