package com.ssslinppp.reflectdemo.interfaces;

import com.ssslinppp.reflectdemo.annotations.ClassAnnotation;
import com.ssslinppp.reflectdemo.annotations.MethodAnnotation;
import com.ssslinppp.reflectdemo.annotations.ParamAnnotation;

/**
 * Description：<br/>
 * User: liulin <br/>
 * Date: 2017/9/22 <br/>
 * Time: 9:37 <br/>
 * Email: liulin@cmss.chinamobile.com <br/>
 * To change this template use File | Settings | File Templates.
 */
@ClassAnnotation(classAlias = "DemoInterfaceOne")
public interface IDemoOne {
    @MethodAnnotation(methodAlias = "methodOne")
    public String getOne(@ParamAnnotation(alias = "keyAlias") String key);

    @MethodAnnotation(methodAlias = "methodMulti")
    public String getMulti(@ParamAnnotation(alias = "nameAlias") String name, @ParamAnnotation(alias = "ageAlias") int age);
}
