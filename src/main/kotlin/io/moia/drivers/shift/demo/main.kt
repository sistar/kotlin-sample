package io.moia.drivers.shift.demo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

data class HandlerOutput(val body: String, val headers: Map<String,String>, val statusCode: Int)

class Main: RequestHandler<Map<String,Any>,Any> {
    override fun handleRequest(input: Map<String,Any>, context: Context?): Any {
       return HandlerOutput("hello ${(input["queryStringParameters"]as Map<String,Any>)["who"]}", mapOf(),200)
    }
}