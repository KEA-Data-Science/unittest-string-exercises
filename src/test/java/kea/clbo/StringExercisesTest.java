package kea.clbo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExercisesTest {

    StringExercises exercises;

    @BeforeEach
    void setUp() {
        exercises = new StringExercises();
    }

    @Test
    void donuts() {
        assertEquals("Number of donuts: 4", exercises.donuts(4));
        assertEquals("Number of donuts: 9", exercises.donuts(9));
        assertEquals("Number of donuts: many", exercises.donuts(10));
        assertEquals("Number of donuts: many", exercises.donuts(99));
    }

    @Test
    void bothEnds() {
        assertEquals("spng", exercises.bothEnds("spring"));
        assertEquals("Helo", exercises.bothEnds("Hello"));
        assertEquals("", exercises.bothEnds("a"));
        assertEquals("xyyz", exercises.bothEnds("xyz"));
    }

    @Test
    void fixStart() {
        /*

              print()
  print ('fix_start')
  test(fix_start('babble'), 'ba**le')
  test(fix_start('aardvark'), 'a*rdv*rk')
  test(fix_start('google'), 'goo*le')
  test(fix_start('donut'), 'donut')
         */
        

    }

    @Test
    void mixUp() {
    }

        /*

  print()
  print ('both_ends')
  test(both_ends('spring'), 'spng')
  test(both_ends('Hello'), 'Helo')
  test(both_ends('a'), '')
  test(both_ends('xyz'), 'xyyz')




  print()
  print ('mix_up')
  test(mix_up('mix', 'pod'), 'pox mid')
  test(mix_up('dog', 'dinner'), 'dig donner')
  test(mix_up('gnash', 'sport'), 'spash gnort')
  test(mix_up('pezzy', 'firm'), 'fizzy perm')

main()



    */


}