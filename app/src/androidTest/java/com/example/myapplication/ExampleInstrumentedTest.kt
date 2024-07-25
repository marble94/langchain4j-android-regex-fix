package com.example.myapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import dev.langchain4j.model.input.PromptTemplate
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // given

        val promptTemplate = PromptTemplate.from("My name is {{it}}.")

        // when
        val prompt = promptTemplate.apply("Klaus")

        // then
        assertThat(prompt.text()).isEqualTo("My name is Klaus.")
    }
}