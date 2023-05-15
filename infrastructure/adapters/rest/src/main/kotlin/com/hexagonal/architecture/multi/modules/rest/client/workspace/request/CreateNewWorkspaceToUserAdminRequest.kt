package com.hexagonal.architecture.multi.modules.rest.client.workspace.request

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser

data class CreateNewWorkspaceToUserAdminRequest(
    val userId: String,
    val workspace: WorkspaceRequest
) {
    data class WorkspaceRequest(
            val name: String,
            val technology: String,
            val sizeInBytes: Long,
            val squad: String,
            val tribe: String,
            val centerCostIdentifier: String
    )
}