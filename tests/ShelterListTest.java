import org.junit.jupiter.api.*;

public class ShelterListTest {
  private ShelterList<Integer> linkedList;

  @BeforeEach
  void setUp() {
    linkedList = new ShelterList<>();
  }

  @Test
  void addFirstEmptyList() {
    linkedList.addFirst(10);
    assertEquals(1, linkedList.length());
    assertEquals(10, linkedList.get(0));
  }
}