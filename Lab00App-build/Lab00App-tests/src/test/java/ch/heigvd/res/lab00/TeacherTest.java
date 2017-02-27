package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Olivier Liechti
 */
public class TeacherTest {

  @Test
  public void aTeacherShouldMakeHello() {
    IInstrument teacher = new Teacher();
    String sound = teacher.play();
    Assert.assertEquals("hello", sound);
  }

}
