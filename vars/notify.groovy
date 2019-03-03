#!/usr/bin/env groovy

def call(message, type='good', channel='eng-builds') {
  try {
    slackSend color: type, message: "${message} (<${env.BUILD_URL}console|Open>)", channel: "#${channel}"
  }
  catch(Exception ex) {
    echo 'sending message failed'
  }
}
