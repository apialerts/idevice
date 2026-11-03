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
    fun `test iPhone Air`() {
        assertEquals("iPhone Air", appleDeviceName("iPhone18,4"))
    }

    @Test
    fun `test iPad Air (13-inch) (M2)`() {
        assertEquals("iPad Air (13-inch) (M2)", appleDeviceName("iPad14,11"))
    }

    @Test
    fun `test Apple TV 4K`() {
        assertEquals("Apple TV 4K", appleDeviceName("AppleTV6,2"))
    }

    @Test
    fun `test Apple Watch Series 11 42mm`() {
        assertEquals("Apple Watch Series 11 42mm", appleDeviceName("Watch7,19"))
    }

    @Test
    fun `test iPhone 18 Pro Max`() {
        assertEquals("iPhone 18 Pro Max", appleDeviceName("iPhone19,7"))
    }

    @Test
    fun `test iPad Pro (13-inch) (M5)`() {
        assertEquals("iPad Pro (13-inch) (M5)", appleDeviceName("iPad17,4"))
    }

    @Test
    fun `test Apple Watch Series 12 46mm`() {
        assertEquals("Apple Watch Series 12 46mm", appleDeviceName("Watch8,5"))
    }

    @Test
    fun `test Simulator`() {
        assertEquals("Simulator", appleDeviceName("x86_64"))
    }

    @Test
    fun `test not found`() {
        assertNull(appleDeviceName("iPhone1"))
    }
}