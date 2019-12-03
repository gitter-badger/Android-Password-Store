package com.passwordstore.android.db.converter

import androidx.room.TypeConverter
import com.passwordstore.android.db.entity.GitAuth

class GitAuthConverter {
    @TypeConverter
    fun stringToGitAuth(authType: String) = GitAuth.valueOf(authType)

    @TypeConverter
    fun gitAuthToString(authType: GitAuth): String = authType.name
}
