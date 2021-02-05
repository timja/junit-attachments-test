package com.github;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class App2Test {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void attachment() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");
        
        assertThat(true, is(true));
    }

    @Test
    @Ignore
    public void attachment2() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(false, is(true));
    }

    @Test
    public void attachment3() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(false, is(true));
    }

    @Test
    public void attachment4() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }

    @Test
    public void attachment5() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }

    @Test
    @Ignore
    public void attachment6() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }
}
