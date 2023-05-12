package com.hexagonal.architecture.multi.modules.domain.workspace

import com.hexagonal.architecture.multi.modules.repository.workspace.CreateWorkspaceRepository
import com.hexagonal.architecture.multi.modules.repository.user.FindUserRepository
import com.hexagonal.architecture.multi.modules.service.workspace.CreateWorkspaceService
import org.springframework.stereotype.Service

@Service
class CreateWorkspace(
    private val createWorkspaceRepository: CreateWorkspaceRepository,
    private val findUserRepository: FindUserRepository
) : CreateWorkspaceService {

    override suspend fun createNewWorkspaceToUserAdmin(json: String): String {

        val user = findUserRepository.findUserById(json)

//        if(user.isAdmin()) {
            return createWorkspaceRepository.createWorkspace(json)
//        }

    }
}