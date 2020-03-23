#!/usr/bin/env groovy

def call(message, channel='eng-builds') {
  try {
    slackSend color: 'good', message: "${message} (<${env.BUILD_URL}console|Open>)", channel: "#${channel}", botUser: true, notifyCommitters: true
  }
  catch(Exception ex) {
    echo 'sending message failed'
  }
}
