package org.example.listners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.yaml.snakeyaml.constructor.Construct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListner  implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
