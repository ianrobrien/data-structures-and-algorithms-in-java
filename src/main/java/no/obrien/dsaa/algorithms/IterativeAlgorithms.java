package no.obrien.dsaa.algorithms;

import lombok.experimental.UtilityClass;
import no.obrien.dsaa.utilities.StringUtils;

import java.util.HashMap;
import java.util.Locale;

@UtilityClass
public class IterativeAlgorithms {

  private static final HashMap<Character, Integer> romanNumeralLookup;

  static {
    romanNumeralLookup = new HashMap<>();
    romanNumeralLookup.put('I', 1);
    romanNumeralLookup.put('V', 5);
    romanNumeralLookup.put('X', 10);
    romanNumeralLookup.put('L', 50);
    romanNumeralLookup.put('C', 100);
    romanNumeralLookup.put('D', 500);
    romanNumeralLookup.put('M', 1000);
  }

  public int toNumeral(String romanNumeral) {
    if (StringUtils.isEmpty(romanNumeral)) {
      return 0;
    }

    char[] romanNumerals = romanNumeral.toUpperCase(Locale.ROOT).toCharArray();

    if (romanNumerals.length == 1) {
      return romanNumeralLookup.get(romanNumerals[0]);
    }

    int result = 0;
    for (int i = 0; i < romanNumerals.length; i++) {
      int current = romanNumeralLookup.get(romanNumerals[i]);
      if (i != romanNumerals.length - 1) {
        int next = romanNumeralLookup.get(romanNumerals[i + 1]);
        if (current < next) {
          result -= current;
        } else {
          result += current;
        }
      } else {
        result += current;
      }
    }
    return result;
  }
}
