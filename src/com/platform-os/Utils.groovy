package com.platform-os

class Utils {
  static def alert(message, channel='eng-builds') {
    slackSend color: 'good', message: "${message} (<${env.BUILD_URL}console|Open>)", channel: "#${channel}"
  }
}
