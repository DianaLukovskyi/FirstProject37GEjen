package utils;

import dto.ContactDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {

        @org.testng.annotations.DataProvider
        public Iterator<Object[]> addNewContact() {
            List<Object[]> list = new ArrayList<>();
            list.add(new Object[]{"Diana", "Lukovsky",  "feling@protomail.com"});
            list.add(new Object[]{"Diana1", "Lukovsky",  "feling@protomail.com"});
            list.add(new Object[]{"Diana3", "Lukovsky",  "feling@protomail.com"});


            return list.iterator();
        }

        @org.testng.annotations.DataProvider
        public Iterator<Object[]> addContactCSVFile() {
            List<Object[]> list = new ArrayList<>();
            String line = "";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(
                        new File("src/test/resources/contacts.csv")));
                line = reader.readLine();

                while(line != null) {
                    String [] split = line.split(",");
                    list.add(new Object[]{new ContactDTO().setName(split[0]).setLastname(split[1])
                            .setEmail(split[2]) });

                    line = reader.readLine();
                }

                reader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return list.iterator();
        }
}
