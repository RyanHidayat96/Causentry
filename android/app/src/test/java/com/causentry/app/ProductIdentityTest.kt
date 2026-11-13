package com.causentry.app

import kotlin.test.Test
import kotlin.test.assertEquals

class ProductIdentityTest {
    @Test
    fun packageIdentityIsStable() {
        assertEquals("com.causentry.app", BuildConfig.APPLICATION_ID)
    }
}
