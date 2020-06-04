package com.vandenbreemen.securefilestorageframework.logging

/**
 * Abstraction of underlying logging system
 * @author kevin
 */
interface CurrentSystemLog {

    fun info(message: String, vararg args: Any)
    fun error(message: String, throwable: Throwable, vararg args: Any)
    fun error(message: String, vararg args: Any)
    fun debug(message: String, vararg args: Any)
    fun warn(message: String, vararg args: Any)

}