package com.hexagonal.architecture.multi.modules.port.driven.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser

interface CreateWorkspaceDrivenPort {
    suspend fun createWorkspace(workspace: CreateWorkspaceToUser.Workspace): String
}