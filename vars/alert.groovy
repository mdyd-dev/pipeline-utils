#!/usr/bin/env groovy

def call(message, channel='eng-builds') {
  try {
    slackSend color: 'danger', message: "${message} (<${env.BUILD_URL}console|Open>)", channel: "#${channel}"
  }
  catch(Exception ex) {
    echo 'sending message failed'
  }
}
