package com.hexagonal.architecture.multi.modules.grpc.server.user

import com.hexagonal.architecture.multi.modules.domain.model.User
import com.hexagonal.architecture.multi.modules.repository.user.FindUserRepository
import org.springframework.stereotype.Repository

@Repository
class FindUser: FindUserRepository {

    override suspend fun findUserById(id: String): User {
        return User(
                id = "37941",
                name = "Joenilson",
                type = "ADMIN",
                phone = "11912345678",
                squad = "tech-circle",
                email = "joenilson@mail.com"
        )
    }
}