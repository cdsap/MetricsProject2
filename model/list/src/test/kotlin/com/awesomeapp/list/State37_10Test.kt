package com.awesomeapp.list

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
import com.awesomeapp.list.*


@OptIn(ExperimentalCoroutinesApi::class)
class State37_10Test {
        @Test
    fun `default state is loading`() {
        val state = State37_10()
        assertTrue(state.isLoading)
    }
}