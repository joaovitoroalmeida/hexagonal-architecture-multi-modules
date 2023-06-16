package com.hexagonal.architecture.multi.modules.grpc.server.user

import com.hexagonal.architecture.multi.modules.domain.workspace.model.User
import com.hexagonal.architecture.multi.modules.port.output.user.FindUserOutputPort
import org.springframework.stereotype.Repository

@Repository
class FindUserServerAdapter: FindUserOutputPort {

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