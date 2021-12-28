package com.androiddevs.mvvmnewsapp.repository

import android.app.DownloadManager
import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode:String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber )

    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)


}