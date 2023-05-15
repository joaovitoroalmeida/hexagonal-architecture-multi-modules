package com.hexagonal.architecture.multi.modules.database.workspace

import com.hexagonal.architecture.multi.modules.domain.model.CreateWorkspaceToUser
import com.hexagonal.architecture.multi.modules.repository.workspace.CreateWorkspaceRepository
import org.springframework.stereotype.Repository

@Repository
class CreateWorkspace: CreateWorkspaceRepository {

    override suspend fun createWorkspace(workspace: CreateWorkspaceToUser.Workspace): String {
        return ""
    }
}