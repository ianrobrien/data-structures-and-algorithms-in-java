package no.obrien.dsaa.utilities;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {

  public boolean isEmpty(String string) {
    return (string == null || string.trim().isEmpty());
  }

}
