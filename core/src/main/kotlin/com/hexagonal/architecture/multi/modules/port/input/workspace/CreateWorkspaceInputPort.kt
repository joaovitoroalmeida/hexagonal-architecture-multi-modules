package com.hexagonal.architecture.multi.modules.port.input.workspace

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser

interface CreateWorkspaceInputPort {

    suspend fun createNewWorkspaceToUserAdmin(createWorkspaceToUser: CreateWorkspaceToUser): String
}