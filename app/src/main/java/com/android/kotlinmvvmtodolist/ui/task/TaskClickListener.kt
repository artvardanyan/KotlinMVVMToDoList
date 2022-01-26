package com.android.kotlinmvvmtodolist.ui.task

import com.android.kotlinmvvmtodolist.database.TaskEntry

class TaskClickListener(val clickListener: (taskEntry: TaskEntry) -> Unit) {
    fun onClick(taskEntry: TaskEntry) = clickListener(taskEntry)
}