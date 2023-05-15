package com.hexagonal.architecture.multi.modules.service.workspace

import com.hexagonal.architecture.multi.modules.domain.model.CreateWorkspaceToUser

interface CreateWorkspaceService {

    suspend fun createNewWorkspaceToUserAdmin(createWorkspaceToUser: CreateWorkspaceToUser): String
}