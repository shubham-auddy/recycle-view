package com.example.helllomyapp

class Employee(var eName: String, var eAge: Int, var isElgible: Boolean) {
    fun geteName(): String {
        return eName
    }

    fun seteName(eName: String) {
        this.eName = eName
    }

    fun geteAge(): Int {
        return eAge
    }

    fun seteAge(eAge: Int) {
        this.eAge = eAge
    }
}