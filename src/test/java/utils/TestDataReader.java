
package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class TestDataReader {

    public static String readJsonFile(String fileName) {

        String resourcePath = "testdata/" + fileName;

        try (InputStream inputStream =
                     TestDataReader.class.getClassLoader()
                             .getResourceAsStream(resourcePath)) {

            if (inputStream == null) {
                throw new RuntimeException(
                        "Test data file not found: " + resourcePath
                );
            }

            return new String(
                    inputStream.readAllBytes(),
                    StandardCharsets.UTF_8
            );

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read test data file: " + fileName, e
            );
        }
    }
}
