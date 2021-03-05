package no.obrien.dsaa.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Calendar;
import java.util.List;

@Data
@EqualsAndHashCode
public class Person implements Comparable<Person> {

  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final Calendar dateOfBirth;
  private final Person mother;
  private final Person father;
  private final List<Person> children;

  @Override
  public int compareTo(Person other) {
    return this.dateOfBirth.compareTo(other.getDateOfBirth());
  }
}
