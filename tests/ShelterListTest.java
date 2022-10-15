import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterListTest {
  private ShelterList<Integer> linkedList;

  //@BeforeEach
  void setUp() {
    linkedList = new ShelterList<>();
  }

  //@Test
  void addFirstEmptyList() {
    linkedList = new ShelterList<>();
    linkedList.addFirst(10);
    assertEquals(1, linkedList.length());
    assertEquals(10, linkedList.get(0));
  }
}