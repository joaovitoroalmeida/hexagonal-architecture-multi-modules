package com.hexagonal.architecture.multi.modules.domain.model

data class CreateWorkspaceToUser(
        val userId: String,
        val workspace: Workspace
) {
    data class Workspace(
            val name: String,
            val technology: String,
            val sizeInBytes: Long,
            val squad: String,
            val tribe: String,
            val centerCostIdentifier: String
    ) {

        fun validWorkspace(): Boolean {
            return validateSize(this.sizeInBytes) && validateSquadPrefix(this.squad)
        }

        private fun validateSquadPrefix(squad: String): Boolean {
            if(squad.contains("tech-")) {
                return true
            }
            return false
        }

        private fun validateSize(sizeInBytes: Long): Boolean {
            return sizeInBytes >= 0
        }
    }
}
