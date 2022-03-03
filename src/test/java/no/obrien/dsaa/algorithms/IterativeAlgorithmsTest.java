package no.obrien.dsaa.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IterativeAlgorithmsTest {

  @Test
  void testConvertRomanNumeralToNumeral() {
    assertEquals(1, IterativeAlgorithms.toNumeral("I"));
    assertEquals(2, IterativeAlgorithms.toNumeral("II"));
    assertEquals(3, IterativeAlgorithms.toNumeral("III"));
    assertEquals(4, IterativeAlgorithms.toNumeral("IV"));
    assertEquals(5, IterativeAlgorithms.toNumeral("V"));
    assertEquals(6, IterativeAlgorithms.toNumeral("VI"));
    assertEquals(7, IterativeAlgorithms.toNumeral("VII"));
    assertEquals(8, IterativeAlgorithms.toNumeral("VIII"));
    assertEquals(9, IterativeAlgorithms.toNumeral("IX"));
    assertEquals(10, IterativeAlgorithms.toNumeral("X"));

    assertEquals(246, IterativeAlgorithms.toNumeral("CCXLVI"));
    assertEquals(789, IterativeAlgorithms.toNumeral("DCCLXXXIX"));
    assertEquals(2421, IterativeAlgorithms.toNumeral("MMCDXXI"));

    assertEquals(160, IterativeAlgorithms.toNumeral("CLX"));
    assertEquals(207, IterativeAlgorithms.toNumeral("CCVII"));
    assertEquals(1009, IterativeAlgorithms.toNumeral("MIX"));
    assertEquals(1066, IterativeAlgorithms.toNumeral("MLXVI"));

    assertEquals(1776, IterativeAlgorithms.toNumeral("MDCCLXXVI"));
    assertEquals(1918, IterativeAlgorithms.toNumeral("MCMXVIII"));
    assertEquals(1954, IterativeAlgorithms.toNumeral("MCMLIV"));
    assertEquals(2014, IterativeAlgorithms.toNumeral("MMXIV"));

    assertEquals(3999, IterativeAlgorithms.toNumeral("MMMCMXCIX"));
  }
}