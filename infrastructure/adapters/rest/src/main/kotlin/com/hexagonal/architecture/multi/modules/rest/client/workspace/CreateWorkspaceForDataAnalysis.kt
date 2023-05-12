package com.hexagonal.architecture.multi.modules.rest.client.workspace

import com.hexagonal.architecture.multi.modules.service.workspace.CreateWorkspaceService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateWorkspaceForDataAnalysis(
        private val createWorkspaceService: CreateWorkspaceService
) {

    @PostMapping
    suspend fun createNewWorkspaceToUserAdmin(json: String): String {
        return createWorkspaceService.createNewWorkspaceToUserAdmin(json)
    }
}