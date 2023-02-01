package com.trinity.basemvvm.ui.utils

object StringUtils {
    fun isBlank(content: String?) = content == null || content.equals("")
}