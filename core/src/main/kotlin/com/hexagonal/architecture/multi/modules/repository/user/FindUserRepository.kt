package com.hexagonal.architecture.multi.modules.repository.user

interface FindUserRepository {
    suspend fun findUserById(id: String): String
}