package com.awesomeapp.log

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.awesomeapp.log.*


@OptIn(ExperimentalCoroutinesApi::class)
class State25_12Test {
        @Test
    fun `default state is loading`() {
        val state = State25_12()
        assertTrue(state.isLoading)
    }
}