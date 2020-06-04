package com.vandenbreemen.securefilestorageframework.logging

import com.vandenbreemen.securefilestorageframework.logging.slf4j.MessageFormatter

/**
 *
 * @author kevin
 */
class SystemOutLog: CurrentSystemLog {

    private fun printMsg(message: String, vararg args: Any) {
        val message = MessageFormatter.arrayFormat(message, args).message
        println(message)
    }

    override fun info(message: String, vararg args: Any) = printMsg(message, args)

    override fun error(message: String, throwable: Throwable, vararg args: Any) {
        printMsg("ERROR - $message", args)
        throwable.printStackTrace()
    }

    override fun error(message: String, vararg args: Any) = printMsg("ERROR - $message", args)

    override fun debug(message: String, vararg args: Any) = printMsg("DEBUG - $message", args)

    override fun warn(message: String, vararg args: Any) = printMsg("WARN - $message", args)
}