package problem11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {
    public static int[][] readInput(String fileName, int size) {
        int[][] result = new int[size][size];

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            int y = 0;
            int x;
            for (String line : lines) {
                x=0;
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    result[y][x] = Integer.parseInt(number);
                    x++;
                }
                y++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
