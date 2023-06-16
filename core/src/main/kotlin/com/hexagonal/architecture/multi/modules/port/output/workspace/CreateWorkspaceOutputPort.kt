package com.hexagonal.architecture.multi.modules.port.output.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser

interface CreateWorkspaceOutputPort {
    suspend fun createWorkspace(workspace: CreateWorkspaceToUser.Workspace): String
}