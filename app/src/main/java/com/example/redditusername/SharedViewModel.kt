package com.example.redditusername

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel(){
    private val _name = MutableLiveData<String>()
    val name : LiveData<String> get() = _name

    private val _age = MutableLiveData<String>()
    val age : LiveData<String> get() = _age

    private val _userName = MutableLiveData<String>()
    val userName : LiveData<String> get() = _userName


    fun setName(name:String){
        _name.value = name
    }

    fun setAge(age:String){
        _age.value = age
    }

    fun setUserName(userName:String){
        _userName.value = userName
    }
}