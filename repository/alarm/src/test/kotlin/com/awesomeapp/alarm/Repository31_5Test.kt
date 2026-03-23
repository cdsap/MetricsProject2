package com.awesomeapp.alarm

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
import com.awesomeapp.alarm.*
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import android.content.Context
import kotlinx.coroutines.flow.first
import org.junit.After
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28])
class Repository31_5Test {
        private lateinit var db: Database31_3
    private lateinit var dao: Dao31_4
    private lateinit var repository: Repository31_5

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, Database31_3::class.java)
            .allowMainThreadQueries()
            .build()
        dao = db.dao()
        repository = Repository31_5(dao)
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun `observeItems emits items`() = runTest {
        dao.upsertAll(listOf(Entity31_1(id = 1, title = "Hello", updatedAt = 1L)))
        val items = repository.observeItems().first()
        assertTrue(items.isNotEmpty())
    }
}