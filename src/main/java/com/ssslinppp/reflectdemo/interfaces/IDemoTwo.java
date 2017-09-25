package com.ssslinppp.reflectdemo.interfaces;

import com.ssslinppp.reflectdemo.annotations.ClassAnnotation;
import com.ssslinppp.reflectdemo.annotations.MethodAnnotation;
import com.ssslinppp.reflectdemo.annotations.ParamAnnotation;

import java.util.HashMap;

/**
 * Description：<br/>
 * User: liulin <br/>
 * Date: 2017/9/22 <br/>
 * Time: 9:42 <br/>
 * Email: liulin@cmss.chinamobile.com <br/>
 * To change this template use File | Settings | File Templates.
 */
@ClassAnnotation(classAlias = "DemoInterfaceTwo")
public interface IDemoTwo {
    @MethodAnnotation(methodAlias = "methodPostOne")
    public String postOne(@ParamAnnotation(alias = "mapAlias") HashMap map);
}
