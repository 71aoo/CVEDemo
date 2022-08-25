package com.example.test;

import com.example.entity.Example;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 * TODO 类描述
 *
 * @author 71ao
 * @date 2022/8/25 14:14
 */
public class XXEDemo {

    public static void main(String[] args) throws Exception {
        read();
    }

    public static void write() throws Exception{
        Serializer serializer = new Persister();
        Example example = new Example("Example Message", 123);
        File result = new File("SimpleXMLXXE/src/main/resources/example.xml");

        serializer.write(example, result);
    }

    public static void read() throws Exception {

        Serializer serializer = new Persister();
        File source = new File("SimpleXMLXXE/src/main/resources/example.xml");

        Example example = serializer.read(Example.class, source);
    }
}
