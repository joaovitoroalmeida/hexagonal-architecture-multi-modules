package com.hexagonal.architecture.multi.modules.database.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser
import com.hexagonal.architecture.multi.modules.port.driven.workspace.CreateWorkspaceDrivenPort
import org.springframework.stereotype.Repository

@Repository
class CreateWorkspaceAdapter: CreateWorkspaceDrivenPort {

    override suspend fun createWorkspace(workspace: CreateWorkspaceToUser.Workspace): String {
        return ""
    }
}