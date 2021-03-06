#!/usr/bin/env groovy

def call() {
  def lookupNames = [:]
  lookupNames["Ignacy Moryc"] = "@ignacy"
  lookupNames["Maciej Krajowski-Kukiel"] = "@maciek"
  lookupNames["piotrze"] = "@piotrze"
  lookupNames["godot"] = "@godot"
  lookupNames["Paweł Kowalski"] = "@Pawel"
  lookupNames["Developer-DNM"] = "@adam"
  lookupNames["Jacek Norbert"] = "@jacek"

  def name = sh(
    script: "git --no-pager show -s --format='%an'",
    returnStdout: true
  ).trim()


  if (lookupNames.containsKey(name)) {
    lookupNames.get(name)
  } else {
    name
  }
}
