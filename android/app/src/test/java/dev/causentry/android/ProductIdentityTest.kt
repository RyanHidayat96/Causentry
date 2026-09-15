package dev.causentry.android

import kotlin.test.Test
import kotlin.test.assertEquals

class ProductIdentityTest {
    @Test
    fun packageIdentityIsStable() {
        assertEquals("dev.causentry.android", BuildConfig.APPLICATION_ID)
    }
}
