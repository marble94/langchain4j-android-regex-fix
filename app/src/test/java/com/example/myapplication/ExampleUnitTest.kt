package com.example.myapplication

import dev.langchain4j.model.input.Prompt
import dev.langchain4j.model.input.PromptTemplate
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun should_create_prompt_from_template_without_variables() {
        // given

        val promptTemplate = PromptTemplate.from("Hello world.")

        val variables = emptyMap<String, Any>()

        // when
        val prompt: Prompt = promptTemplate.apply(variables)

        // then
        assertThat(prompt.text()).isEqualTo("Hello world.")
    }

    @Test
    fun should_create_prompt_from_template_with_it_variable() {
        // given

        val promptTemplate = PromptTemplate.from("My name is {{it}}.")

        // when
        val prompt = promptTemplate.apply("Klaus")

        // then
        assertThat(prompt.text()).isEqualTo("My name is Klaus.")
    }
}