package com.elmoselhy.commondesignpattern.singleton

class OldWaySingleton private constructor(){

    companion object {
        private var instance: OldWaySingleton? = null
        fun getInstance(): OldWaySingleton {
            if (instance == null)
                instance = OldWaySingleton()

            return instance!!
        }
    }

}