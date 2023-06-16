package com.hexagonal.architecture.multi.modules.rest.client.workspace

import com.hexagonal.architecture.multi.modules.rest.client.workspace.extension.toDomain
import com.hexagonal.architecture.multi.modules.rest.client.workspace.request.CreateNewWorkspaceToUserAdminRequest
import com.hexagonal.architecture.multi.modules.port.input.workspace.CreateWorkspaceInputPort
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateWorkspaceForDataAnalysisClientAdapter(
        private val createWorkspaceInputPort: CreateWorkspaceInputPort
) {

    @PostMapping
    suspend fun createNewWorkspaceToUserAdmin
            (@RequestBody createNewWorkspaceToUserAdminRequest: CreateNewWorkspaceToUserAdminRequest): String {
        return createWorkspaceInputPort.createNewWorkspaceToUserAdmin(createNewWorkspaceToUserAdminRequest.toDomain())
    }
}