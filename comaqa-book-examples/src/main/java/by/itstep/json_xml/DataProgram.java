package by.itstep.json_xml;

import by.itstep.json_xml.dto.Address;
import by.itstep.json_xml.dto.User;
import by.itstep.json_xml.dto.UsersWrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class DataProgram {

    public static void main(String[] args) throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
        processDataFile(jsonMapper,"example.json");

        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        //xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        processDataFile(xmlMapper,"example.xml");
    }

    private static void processDataFile(ObjectMapper mapper, String sourceFile) throws IOException {
        ClassLoader classLoader = DataProgram.class.getClassLoader();

        //read json file
        File jsonFile = new File(classLoader.getResource(sourceFile).getFile());
        String data = FileUtils.readFileToString(jsonFile, "utf-8");
        //parse user
        UsersWrapper usersWrapper = mapper.readValue(data, UsersWrapper.class);
        //...
        User newUser = new User(34, "TestName", "TestLastName", null,
                new Address("TestCountry", "TestCity"));
        usersWrapper.getUsers().add(newUser);

        String newOutputString = mapper.writeValueAsString(usersWrapper);

        System.out.println(newOutputString);
    }
}
