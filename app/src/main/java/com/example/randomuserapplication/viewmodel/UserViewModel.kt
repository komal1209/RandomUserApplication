package com.example.randomuserapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randomuserapplication.data.model.User
import com.example.randomuserapplication.data.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    fun fetchUsers(results: Int) {
        viewModelScope.launch {
            try {
                val response = userRepository.getUsers(results)
                _users.value = response.results
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}