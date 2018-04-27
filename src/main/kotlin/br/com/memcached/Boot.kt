package br.com.memcached

import net.spy.memcached.MemcachedClient
import java.net.InetSocketAddress
import java.util.*


object Boot {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val client = MemcachedClient(InetSocketAddress("localhost", 11211))
        client.set("string-value", 3600, "test")
        client.set("date-value", 3600, Date())

        val stringValue = client.get("string-value")
        val dateValue = client.get("date-value")

        print(stringValue)
        print(dateValue)
    }

}