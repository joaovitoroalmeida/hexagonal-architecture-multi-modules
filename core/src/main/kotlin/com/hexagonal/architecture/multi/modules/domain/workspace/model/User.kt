package com.hexagonal.architecture.multi.modules.domain.workspace.model

data class User(
        val id: String,
        val type: String,
        val name: String,
        val phone: String,
        val squad: String,
        val email: String
) {
    fun isAdmin(): Boolean {
        return type == "ADMIN"
    }
}
