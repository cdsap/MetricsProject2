package com.awesomeapp.checkout

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
import com.awesomeapp.checkout.*
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
class Usecase5_6Test {
        private lateinit var db: Database5_3
    private lateinit var dao: Dao5_4
    private lateinit var repository: Repository5_5
    private lateinit var useCase: Usecase5_6

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, Database5_3::class.java)
            .allowMainThreadQueries()
            .build()
        dao = db.dao()
        repository = Repository5_5(dao)
        useCase = Usecase5_6(repository)
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun `invoke returns items`() = runTest {
        dao.upsertAll(listOf(Entity5_1(id = 1, title = "Hi", updatedAt = 1L)))
        val items = useCase().first()
        assertTrue(items.isNotEmpty())
    }
}