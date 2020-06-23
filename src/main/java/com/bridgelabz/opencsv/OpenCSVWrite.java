package com.bridgelabz.opencsv;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVWrite {
    private static final String STRING_ARRAY_SAMPLE = "./arraysample.csv";

    public static void main(String[] args) throws IOException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));

                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"Name", "Email", "Phone", "Country"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"Nikhil", "nick.dhruwe@gmail.com", "+1-1111111111", "India"});
            csvWriter.writeNext(new String[]{"Jai", "jai.veer@outlook.com", "+1-1111111112", "India"});
        }
    }
}
