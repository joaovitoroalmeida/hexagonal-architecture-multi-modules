package com.hexagonal.architecture.multi.modules.service.workspace

interface CreateWorkspaceService {

    suspend fun createNewWorkspaceToUserAdmin(json: String): String
}