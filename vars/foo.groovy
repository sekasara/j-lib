#!/usr/bin/env groovy

@Grapes([
    @Grab (group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7.1'),
    @Grab (group='javax.xml.bind', module='jaxb-api', version='2.3.1'),
    @Grab (group = 'com.veracode.vosp.api.wrappers', module = 'vosp-api-wrappers-java', version = '21.2.7.4')
])

import com.veracode.apiwrapper.wrappers.*
import groovy.json.JsonOutput



def call() {
    UploadAPIWrapper uploadAPIWrapper = new UploadAPIWrapper();
    SandboxAPIWrapper sandboxAPIWrapper = new SandboxAPIWrapper();
    ResultsAPIWrapper resultsAPIWrapper = new ResultsAPIWrapper();
    
    println(uploadAPIWrapper)
    
    println("Hello")
}
