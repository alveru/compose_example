package com.example.compose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.utils.onFailure
import com.example.utils.onSuccess
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val configManager: ConfigManager
) : ViewModel() {

    private val _loaded = MutableLiveData<Boolean>()
    val loaded: LiveData<Boolean> get() = _loaded

    init {
        viewModelScope.launch {
            configManager.getConfig()
                .onSuccess {
                    _loaded.postValue(true)
                }
                .onFailure {
                    _loaded.postValue(false)
                }
        }
    }

}