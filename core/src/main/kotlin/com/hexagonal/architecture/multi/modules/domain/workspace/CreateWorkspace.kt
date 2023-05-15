package com.hexagonal.architecture.multi.modules.domain.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser
import com.hexagonal.architecture.multi.modules.port.driven.user.FindUserDrivenPort
import com.hexagonal.architecture.multi.modules.port.driven.workspace.CreateWorkspaceDrivenPort
import com.hexagonal.architecture.multi.modules.port.driving.workspace.CreateWorkspaceDrivingPort
import org.springframework.stereotype.Component

@Component
class CreateWorkspace(
        private val createWorkspacePort: CreateWorkspaceDrivenPort,
        private val findUserDrivenPort: FindUserDrivenPort
) : CreateWorkspaceDrivingPort {

    override suspend fun createNewWorkspaceToUserAdmin(createWorkspaceToUser: CreateWorkspaceToUser): String {

        val user = findUserDrivenPort.findUserById(createWorkspaceToUser.userId)

        if(user.isAdmin() && createWorkspaceToUser.workspace.validWorkspace()) {
            createWorkspacePort.createWorkspace(createWorkspaceToUser.workspace)
        }

        return ""
    }
}