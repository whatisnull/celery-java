package org.sedlakovi.celery;

import com.google.common.collect.ImmutableSet;
import org.kohsuke.MetaInfServices;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.*;
import java.util.*;

@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TaskAnnotationProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return ImmutableSet.of(Task.class.getName());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Map<String,Set<String>> services = new HashMap<String, Set<String>>();

        // discover services from the current compilation sources
        roundEnv.getElementsAnnotatedWith(Task.class).forEach(System.out::println);

        return false;
    }
}
