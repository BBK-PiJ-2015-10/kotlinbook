package com.palacios.chapter9

import java.util.Date;
import java.net.URI

data class BlogEntry(
    var title: String, var description: String, val publishedTime: Date, val approved: Boolean?, val lastUpdated: Date,
    val url: URI, val CommentCount: Int?, val topTags: List<String>, val email: String?
) {

}