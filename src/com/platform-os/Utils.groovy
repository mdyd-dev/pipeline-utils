package com.platform-os

class Utils {
  static def currentDurationString() {
    return hudson.Util.getTimeSpanString(currentBuild.getDuration());
  }

  // doChangesRequireBuild
  static boolean doChangesRequireBuild(build, def pathRegex) {
    for (def path in getChangedFiles(build)) {
      if ( path ==~ pathRegex) {
        return true
      }
    }
    return false
  }

  // getChangedFiles
  static def getChangedFiles(build) {
    def found = []

    for (def changeSet in build.getChangeSets()) {
      for (def change in changeSet.logs) {
        for (def path in change.paths) {
          found.add(path.path)
        }
      }
    }
    return found
  }

}
