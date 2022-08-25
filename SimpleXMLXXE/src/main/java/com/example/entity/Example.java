package com.example.entity;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * TODO 类描述
 *
 * @author 71ao
 * @date 2022/8/25 14:15
 */
@Root
public class Example {

    @Element
    private String text;

    @Attribute
    private int index;

    public Example() {
        super();
    }

    public Example(String text, int index) {
        this.text = text;
        this.index = index;
    }

    public String getMessage() {
        return text;
    }

    public int getId() {
        return index;
    }
}
