package com.awesomeapp.login

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
import com.awesomeapp.login.*
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
class Usecase3_6Test {
        private lateinit var db: Database3_3
    private lateinit var dao: Dao3_4
    private lateinit var repository: Repository3_5
    private lateinit var useCase: Usecase3_6

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, Database3_3::class.java)
            .allowMainThreadQueries()
            .build()
        dao = db.dao()
        repository = Repository3_5(dao)
        useCase = Usecase3_6(repository)
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun `invoke returns items`() = runTest {
        dao.upsertAll(listOf(Entity3_1(id = 1, title = "Hi", updatedAt = 1L)))
        val items = useCase().first()
        assertTrue(items.isNotEmpty())
    }
}