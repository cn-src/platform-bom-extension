#!/usr/bin/env groovy
import groovy.xml.*

def pom = new XmlSlurper(false, false).parse("./pom.xml")
def demoPom = new XmlSlurper(false, false).parse("./demo/pom.xml")
def dependencyList = pom.dependencyManagement.dependencies.children()
dependencyList.version.replaceNode {}
dependencyList.exclusions.replaceNode {}
demoPom.dependencies = dependencyList

XmlUtil.serialize(demoPom, new PrintWriter(new File("./demo/pom.xml")))
