#!/usr/bin/env groovy

def call() {
  return hudson.Util.getTimeSpanString(currentBuild.getDuration());
}
