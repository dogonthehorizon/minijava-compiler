/*
this
    * is a comment
 ********** also /* hahaha
 */
class Main {
  void main() {
    boolean b = new Blizzard().run(null);
  }
}

// This is a comment for the Blizzard class
// a + b = 42 * 24 / 30 // 4
class Blizzard { //This is another comment for the Blizzard class.
  boolean run(String[] x) {
    int a = 4;
    int b = a+215;
    // /* this is a comment! */

    if(a >= /* this is also a comment */ b) {
        /* and
         * this
         * is
         * a
         comment
         too
         */
        return a / b;
    }
  }
}
