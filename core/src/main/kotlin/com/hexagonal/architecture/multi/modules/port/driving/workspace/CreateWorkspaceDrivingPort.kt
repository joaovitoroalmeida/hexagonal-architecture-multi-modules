package com.hexagonal.architecture.multi.modules.port.driving.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser

interface CreateWorkspaceDrivingPort {

    suspend fun createNewWorkspaceToUserAdmin(createWorkspaceToUser: CreateWorkspaceToUser): String
}