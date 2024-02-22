package org.homework21;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Convert {
    private String folderPath;

    public Convert(String folderPath) {
        this.folderPath = folderPath;
    }
    public StringBuilder findAndConvert() throws IOException {
        File folder = new File(folderPath);
        List<String> files = Arrays.asList(folder.list());
        String ex;
        StringBuilder mess = new StringBuilder();
        for(String file : files) {
            ex = getFileExtension(file);
            if (".json".equals(ex)) {
                mess.append(jsonToYaml(folderPath + "/" + file)+"\n");
            }else if (".yaml".equals(ex)) {
                mess.append(yamlToJson(folderPath + "/" + file)+"\n");
            }else {
                System.out.println("Files "+ex+" can't be converted");
                continue;
            }
        }
        return mess;
    }
    private String jsonToYaml(String path) throws IOException {
        File json = new File(path);
        FileInputStream fis = new FileInputStream(json);
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        int a;
        while ((a = fis.read()) != -1) {
            sb.append((char) a);
        }
        Map map = gson.fromJson(sb.toString(), Map.class);
        int index = json.getName().indexOf(".");
        File yaml = new File(folderPath+"/"+json.getName().substring(0, index)+".yaml");
        yaml.createNewFile();
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        om.writeValue(yaml, map);
        return json.getName()+" ---> "+yaml.getName()+"\n Size: "+json.length()+"--->"+yaml.length();
    }
    private String yamlToJson(String path) throws IOException {
        File yaml = new File(path);
        FileInputStream fis = new FileInputStream(yaml);
        Yaml yam = new Yaml();
        StringBuilder sb = new StringBuilder();
        int a;
        while ((a = fis.read()) != -1) {
            sb.append((char) a);
        }
        Map map = yam.load(sb.toString());
        int index = yaml.getName().indexOf(".");
        File json = new File(folderPath+"/"+yaml.getName().substring(0, index)+".json");
        json.createNewFile();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(map);
        FileOutputStream fos = new FileOutputStream(json);
        fos.write(str.getBytes(StandardCharsets.UTF_8));
        return yaml.getName()+" ---> "+json.getName()+"\n Size: "+yaml.length()+"--->"+json.length();
    }
    private static String getFileExtension(String str) {
        int index = str.indexOf(".");
        return index == -1? null : str.substring(index);
    }
}
