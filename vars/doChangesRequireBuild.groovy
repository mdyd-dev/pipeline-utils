#!/usr/bin/env groovy

def call(def pathRegex) {
  for (def path in getChangedFiles()) {
    if ( path ==~ pathRegex) {
      return true
    }
  }
  return false
}

def getChangedFiles() {
  def found = []

  for (def changeSet in currentBuild.getChangeSets()) {
    for (def change in changeSet.logs) {
      for (def path in change.paths) {
        found.add(path.path)
      }
    }
  }
  return found
}
