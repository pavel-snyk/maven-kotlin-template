package internal

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class MainTest {
  @Test
  fun junitTestExamples() {
    assertAll("don't forget to remove classes under `internal` package",
      { assertEquals("maven", "maven") },
      { assertEquals("kotlin", "kotlin") },
      { assertEquals("template", "template") }
    )
  }
}
