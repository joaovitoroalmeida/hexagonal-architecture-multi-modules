package com.hexagonal.architecture.multi.modules.repository.workspace

import com.hexagonal.architecture.multi.modules.domain.model.CreateWorkspaceToUser

interface CreateWorkspaceRepository {
    suspend fun createWorkspace(workspace: CreateWorkspaceToUser.Workspace): String
}