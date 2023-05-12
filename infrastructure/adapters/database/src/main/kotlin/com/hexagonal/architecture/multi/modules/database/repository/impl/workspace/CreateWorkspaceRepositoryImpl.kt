package com.hexagonal.architecture.multi.modules.database.repository.impl.workspace

import com.hexagonal.architecture.multi.modules.repository.workspace.CreateWorkspaceRepository
import org.springframework.stereotype.Repository

@Repository
class CreateWorkspaceRepositoryImpl: CreateWorkspaceRepository {

    override suspend fun createWorkspace(json: String): String {
        return json
    }
}