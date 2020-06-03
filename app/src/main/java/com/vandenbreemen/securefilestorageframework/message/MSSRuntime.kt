package com.vandenbreemen.securefilestorageframework.message

import java.lang.RuntimeException

/**
 *
 * @author kevin
 */
class MSSRuntime(message: String, cause: Throwable? = null): RuntimeException(message, cause) {

    constructor(message: String): this(message, null)

}