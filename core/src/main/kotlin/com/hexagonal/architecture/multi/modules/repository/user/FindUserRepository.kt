package com.hexagonal.architecture.multi.modules.repository.user

import com.hexagonal.architecture.multi.modules.domain.model.User

interface FindUserRepository {
    suspend fun findUserById(id: String): User
}