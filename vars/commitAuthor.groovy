#!/usr/bin/env groovy

def call() {
  sh(
    script: "git --no-pager show -s --format='%an'",
    returnStdout: true
  ).trim()
}
