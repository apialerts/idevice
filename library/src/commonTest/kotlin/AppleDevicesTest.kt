package com.apialerts.idevice

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class AppleDevicesTest {

    @Test
    fun `test iPhone X`() {
        assertEquals("iPhone X", appleDeviceName("iPhone10,6"))
    }

    @Test
    fun `test not found`() {
        assertNull(appleDeviceName("iPhone1"))
    }
}