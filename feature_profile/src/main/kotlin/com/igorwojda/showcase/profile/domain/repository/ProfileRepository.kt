package com.igorwojda.showcase.profile.domain.repository

import com.igorwojda.showcase.base.domain.result.Result

internal interface ProfileRepository {

    suspend fun getAlbumInfo(artistName: String, albumName: String, mbId: String?): Result<Album>

    suspend fun searchAlbum(phrase: String?): Result<List<Album>>
}
