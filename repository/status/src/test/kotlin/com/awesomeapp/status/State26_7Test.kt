package com.awesomeapp.status

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
import com.awesomeapp.status.*


@OptIn(ExperimentalCoroutinesApi::class)
class State26_7Test {
        @Test
    fun `default state is loading`() {
        val state = State26_7()
        assertTrue(state.isLoading)
    }
}