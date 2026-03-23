package com.awesomeapp.sync

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
import com.awesomeapp.sync.*


@OptIn(ExperimentalCoroutinesApi::class)
class State15_7Test {
        @Test
    fun `default state is loading`() {
        val state = State15_7()
        assertTrue(state.isLoading)
    }
}