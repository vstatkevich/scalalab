package com.adform.scalalab

import org.scalatest.FunSuite

/**
 * Created by v.statkevich on 2015-02-25.
 */
class HelloTest extends FunSuite {
  val sharedHello = new Hello()

  test("Hello works") {
    val result = sharedHello.Hello("Vova")
    assert("Hello, Vova" == result)
  }
}
