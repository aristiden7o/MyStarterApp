package co.kaush.mystarterapp.myappmodule.pojos.test;

import org.junit.Test;

import co.kaush.mystarterapp.myappmodule.pojos.SamplePojo;

import static org.fest.assertions.api.Assertions.assertThat;

public class SamplePojoTest {

    @Test
    public void testMultiply() {

        // MyClass is tested
        SamplePojo tester = new SamplePojo();
        assertThat(tester.someMethod()).isEqualTo(-1);
    }

}
