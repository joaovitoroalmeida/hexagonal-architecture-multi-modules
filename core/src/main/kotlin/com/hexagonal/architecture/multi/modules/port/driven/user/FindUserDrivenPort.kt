package com.hexagonal.architecture.multi.modules.port.driven.user

import com.hexagonal.architecture.multi.modules.domain.workspace.model.User

interface FindUserDrivenPort {
    suspend fun findUserById(id: String): User
}