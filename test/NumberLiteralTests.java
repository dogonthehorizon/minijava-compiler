class Test {
    void main() {
        a = 0x11;
        b = 021;
        c = 17;

        tooLong = 0x198726349187623; // Should throw an error
        tooLong = 01234161357134;    // Should throw an error
        idkSomethingSilly = 100000;  // Should NOT throw an error
    }
}