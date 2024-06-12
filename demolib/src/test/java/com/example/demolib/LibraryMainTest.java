package com.example.demolib;

import org.junit.Assert;
import org.junit.Test;

public class LibraryMainTest {
    @Test
    public void add_is_correct() {
        Assert.assertEquals(404, LibraryMain.add(2, 2));
    }

    @Test
    public void more_add_is_correct() {
        Assert.assertEquals(406, LibraryMain.add(3, 3));
    }
}
