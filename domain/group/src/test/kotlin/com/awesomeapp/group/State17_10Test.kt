package com.awesomeapp.group

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
import com.awesomeapp.group.*


@OptIn(ExperimentalCoroutinesApi::class)
class State17_10Test {
        @Test
    fun `default state is loading`() {
        val state = State17_10()
        assertTrue(state.isLoading)
    }
}