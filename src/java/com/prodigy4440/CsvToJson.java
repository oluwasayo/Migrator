/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author prodigy4440
 */
public class CsvToJson {

//  public static void main(String[] args) throws Exception {
//    File input = new File(
//            "/home/prodigy4440/Desktop/clean/APRIL_2015/LEKKI.csv");
//    File output = new File("/home/prodigy4440/Desktop/lekki.json");
//
//    List<Map<?, ?>> data = readObjectsFromCsv(input);
//    writeAsJson(data, output);
//  }
  public static List<Map<?, ?>> readObjectsFromCsv(File file) throws IOException {
    CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
    CsvMapper csvMapper = new CsvMapper();
    String data = FileUtils.readFileToString(file, Charset.forName("ASCII"));
    MappingIterator<Map<?, ?>> mappingIterator = csvMapper.reader(Map.class).with(bootstrap).readValues(data);
    List<Map<?, ?>> readAll = mappingIterator.readAll();
    return readAll;
  }

  public static void writeAsJson(List<Map<?, ?>> data, File file) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(file, data);
  }

  public static String generateJsonFileName(File file) {
    if (Objects.isNull(file)) {
      return null;
    } else {
      return file.getParent() + File.separator + file.getName().replace(".csv", ".json");
    }
  }

  public static void loadBaseDirAndConvertCsvToJson(String baseDir) throws IOException {
    DirectoryStream<Path> baseDirPath = Files.newDirectoryStream(Paths.get(baseDir));
    Iterator<Path> iterator = baseDirPath.iterator();
    while (iterator.hasNext()) {
      Path dirPath = iterator.next();
      DirectoryStream<Path> dirFiles = Files.newDirectoryStream(dirPath);
      Iterator<Path> innerIterator = dirFiles.iterator();
      while (innerIterator.hasNext()) {
        Path filePath = innerIterator.next();
        if (filePath.toFile().getName().endsWith(".csv")) {
          File inputFile = filePath.toFile();
          File outputFile = new File(generateJsonFileName(inputFile));
          System.out.println(inputFile);
          System.out.println(outputFile);
          List<Map<?, ?>> data = readObjectsFromCsv(inputFile);
          writeAsJson(data, outputFile);
        }
      }
    }
  }

//  public static void main(String[] args) throws IOException {
//    loadBaseDirAndConvertCsvToJson("/home/prodigy4440/Desktop/raw");
//  }
}
