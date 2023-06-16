package com.hexagonal.architecture.multi.modules.port.output.user

import com.hexagonal.architecture.multi.modules.domain.workspace.model.User

interface FindUserOutputPort {
    suspend fun findUserById(id: String): User
}