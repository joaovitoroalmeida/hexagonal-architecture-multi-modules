package com.hexagonal.architecture.multi.modules.repository.workspace

interface CreateWorkspaceRepository {
    suspend fun createWorkspace(json: String): String
}