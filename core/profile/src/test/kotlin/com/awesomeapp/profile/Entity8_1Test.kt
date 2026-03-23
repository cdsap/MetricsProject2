package com.awesomeapp.profile

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
import com.awesomeapp.profile.*


@OptIn(ExperimentalCoroutinesApi::class)
class Entity8_1Test {
        @Test
    fun `entity can be created`() {
        val entity = Entity8_1(id = 1, title = "Title", updatedAt = 1L)
        assertNotNull(entity)
    }
}