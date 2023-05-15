package com.hexagonal.architecture.multi.modules.rest.client.workspace.extension

import com.hexagonal.architecture.multi.modules.domain.workspace.model.CreateWorkspaceToUser
import com.hexagonal.architecture.multi.modules.rest.client.workspace.request.CreateNewWorkspaceToUserAdminRequest

fun CreateNewWorkspaceToUserAdminRequest.toDomain() =
        CreateWorkspaceToUser(
            userId = this.userId,
            workspace = this.workspace.toDomain()
        )

fun CreateNewWorkspaceToUserAdminRequest.WorkspaceRequest.toDomain() =
        CreateWorkspaceToUser.Workspace(
                name = this.name,
                technology = this.technology,
                sizeInBytes = this.sizeInBytes,
                squad = this.squad,
                tribe = this.tribe,
                centerCostIdentifier = this.centerCostIdentifier
        )