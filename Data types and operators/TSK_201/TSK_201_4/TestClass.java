package TSK_201.TSK_201_4;

public class TestClass {
    String someStrValue;
    int someIntValue;

    TestClass(String someStrValue, int someIntValue) {
        this.someStrValue = someStrValue;
        this.someIntValue = someIntValue;
    }

    @Override
    public String toString() {
        return "TestStr: " + someStrValue + ", TestInt: " + someIntValue;
    }
}
