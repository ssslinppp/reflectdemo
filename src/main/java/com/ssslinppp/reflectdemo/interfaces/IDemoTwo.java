package com.ssslinppp.reflectdemo.interfaces;

import com.ssslinppp.reflectdemo.annotations.ClassAnnotation;
import com.ssslinppp.reflectdemo.annotations.MethodAnnotation;
import com.ssslinppp.reflectdemo.annotations.ParamAnnotation;

import java.util.HashMap;

@ClassAnnotation(classAlias = "DemoInterfaceTwo")
public interface IDemoTwo {
    @MethodAnnotation(methodAlias = "methodPostOne")
    public String postOne(@ParamAnnotation(alias = "mapAlias") HashMap map);
}
