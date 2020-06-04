package com.vandenbreemen.securefilestorageframework.logging;

import org.junit.Test;

/**
 * @author kevin
 */
public class CurrentSystemLogFromJavaTest {

    @Test
    public void testAbleToLogWithParameters() {

        SystemOutLog log = new SystemOutLog();
        log.info("This is a {}", "test");
        log.warn("This is a {}", "warning");
        log.error("Uh oh");
        log.error("A giant error {}", new Throwable(), "occurred");
        log.debug("Debugging");

    }

}
