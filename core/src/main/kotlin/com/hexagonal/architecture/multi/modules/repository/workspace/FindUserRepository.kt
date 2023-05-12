package com.hexagonal.architecture.multi.modules.repository.workspace

interface FindUserRepository {
    suspend fun findUserById(id: String): String
}