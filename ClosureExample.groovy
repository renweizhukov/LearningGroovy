#!/usr/bin/env groovy

def projects = ["nativeappsdk", "speech2text"]
def printProject = { println "Project ${it}" }

projects.each(printProject)

def closureMethod(Closure c) 
{
	c.call()
}

closureMethod 
{
	println "Closure called"
}