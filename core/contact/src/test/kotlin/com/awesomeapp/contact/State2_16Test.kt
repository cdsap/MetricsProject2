package com.awesomeapp.contact

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
import com.awesomeapp.contact.*


@OptIn(ExperimentalCoroutinesApi::class)
class State2_16Test {
        @Test
    fun `default state is loading`() {
        val state = State2_16()
        assertTrue(state.isLoading)
    }
}