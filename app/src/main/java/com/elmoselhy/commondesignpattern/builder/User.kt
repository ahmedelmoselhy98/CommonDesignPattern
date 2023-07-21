package com.elmoselhy.commondesignpattern.builder

class User private constructor(var email: String, var password: String) {

    class Builder {
        private var email = ""
        private var password = ""

        fun setEmail(value: String) = apply {
            email = value
        }

        fun setPassword(value: String) = apply {
            password = value
        }

        fun builder() = User(email, password)
    }
}