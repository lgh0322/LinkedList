package com.vaca.linkedlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queue: Queue<String> = LinkedList<String>()
        //添加元素
        //添加元素
        queue.offer("a")
        queue.offer("b")
        queue.offer("c")
        queue.offer("d")
        queue.offer("e")
        for (q in queue) {
            println(q)
        }
        println("===")
        println("poll=" + queue.poll()) //返回第一个元素，并在队列中删除

        for (q in queue) {
            println(q)
        }
        println("===")
        println("element=" + queue.element()) //返回第一个元素

        for (q in queue) {
            println(q)
        }
        println("===")
        println("peek=" + queue.peek()) //返回第一个元素

        for (q in queue) {
            println(q)
        }
    }
}