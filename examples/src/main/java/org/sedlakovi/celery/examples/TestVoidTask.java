package org.sedlakovi.celery.examples;

import org.kohsuke.MetaInfServices;
import org.sedlakovi.celery.Task;

import java.lang.annotation.Annotation;

@MetaInfServices
public class TestVoidTask implements Task {

    public void run(int x, int y) {
        System.out.println(x + y);
    }
}
