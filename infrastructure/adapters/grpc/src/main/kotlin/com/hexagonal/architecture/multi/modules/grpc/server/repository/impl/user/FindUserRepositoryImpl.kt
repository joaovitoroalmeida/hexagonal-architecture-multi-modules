package com.hexagonal.architecture.multi.modules.grpc.server.repository.impl.user

import com.hexagonal.architecture.multi.modules.repository.user.FindUserRepository
import org.springframework.stereotype.Repository

@Repository
class FindUserRepositoryImpl: FindUserRepository {

    override suspend fun findUserById(id: String): String {
        return id
    }
}