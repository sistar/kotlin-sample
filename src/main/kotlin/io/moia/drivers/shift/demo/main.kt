package io.moia.drivers.shift.demo

import java.io.*
import com.fasterxml.jackson.module.kotlin.*

data class HandlerInput(val who: String)
data class HandlerOutput(val greet: String)

class Main {
    val mapper = jacksonObjectMapper()

    fun handler(input: InputStream, output: OutputStream) : Unit {
        val inputObj = mapper.readValue<HandlerInput>(input)
        mapper.writeValue(output,HandlerOutput("hello ${inputObj.who}"))
    }

}
