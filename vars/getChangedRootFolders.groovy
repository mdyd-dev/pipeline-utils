#!/usr/bin/env groovy

def call(def folderNames) {
  changed = []

  for (def folder in folderNames) {
    for (def path in getChangedFiles()) {
      if ( path ==~ folder) {
        changed.add(folder)
      }
    }
  }
  return changed
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
