package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("countChange: example given in instructions") {
    assert(countChange(4, List(1, 2)) === 3)
  }
  
  test("countChange: sorted CHF") {
    assert(countChange(300, List(5, 10, 20, 50, 100, 200, 500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(countChange(301, List(5, 10, 20, 50, 100, 200, 500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(countChange(300, List(500, 5, 50, 100, 20, 200, 10)) === 1022)
  }

  test("countChange: lest the bough breaks") {
    assert(countChange(1, List(3, 1, 2)) === 1)
    assert(countChange(4, List(3, 1, 2)) === 4)
  }

  test("countChange: only valid and sorted CHF") {
    assert(countChange(300, List(5, 10, 20, 50, 100, 200)) === 1022)
  }

  test("countChange: another unsorted CHF") {
    assert(countChange(300, List(5, 50, 100, 20, 200, 10)) === 1022)
  } 

  test("countChange: amount zero") {
    assert(countChange(0, List(1, 2, 3, 4)) === 0)
  }

  test("countChange: no coins") {
    assert(countChange(100, List()) === 0)
  }

  test("countChange: zero amount and no coins") {
    assert(countChange(0, List()) === 0)
  }
}