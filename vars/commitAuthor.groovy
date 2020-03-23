#!/usr/bin/env groovy

def gitCommitAuthor() {
  sh(
    script: "git --no-pager show -s --format='%an'",
    returnStdout: true
  ).trim()
}
