package com.hexagonal.architecture.multi.modules.domain.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser
import com.hexagonal.architecture.multi.modules.port.output.user.FindUserOutputPort
import com.hexagonal.architecture.multi.modules.port.output.workspace.CreateWorkspaceOutputPort
import com.hexagonal.architecture.multi.modules.port.input.workspace.CreateWorkspaceInputPort
import org.springframework.stereotype.Component

@Component
class CreateWorkspace(
        private val createWorkspacePort: CreateWorkspaceOutputPort,
        private val findUserOutputPort: FindUserOutputPort
) : CreateWorkspaceInputPort {

    override suspend fun createNewWorkspaceToUserAdmin(createWorkspaceToUser: CreateWorkspaceToUser): String {

        val user = findUserOutputPort.findUserById(createWorkspaceToUser.userId)

        if(user.isAdmin() && createWorkspaceToUser.workspace.validWorkspace()) {
            createWorkspacePort.createWorkspace(createWorkspaceToUser.workspace)
        }

        return ""
    }
}