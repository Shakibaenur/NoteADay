// ==== Jenkins build server setup ====
// 1. Install Jenkins
// 2. Install Jenkins Blue Ocean plugin (Pipeline builds)
// 3. Install Java in Jenkins
//     - Get tar.gz link from https://adoptopenjdk.net/ (Example: https://github.com/AdoptOpenJDK/openjdk11-binaries/releases/download/jdk-11.0.10%2B9/OpenJDK11U-jdk_x64_linux_hotspot_11.0.10_9.tar.gz)
//     - Manage Jenkins > Global Tool Configuration > JDK > JDK installations...
//     - Add JDK
//         - Name: Java 11
//         - Add Installer > Extract *.zip/*.tar.gz (remove default Oracle installation)
//         - Label: master
//         - Download Url: <use above url>
//         - Subdirectory of extracted archive: <open the tar.gz file and use the root folder name here>
//     - Save
// 4. Install Android SDK
//     - Download latest Android SDK (https://developer.android.com/studio#command-tools) (Example: https://dl.google.com/android/repository/commandlinetools-linux-6858069_latest.zip)
//     - mkdir /opt/Android
//     - unzip downloaded file...
//     - move contents into /opt/Android/cmdline-tools/latest
//     - cd /opt/Android/cmdline-tools/latest/bin
//     - ./sdkmanager --update
//     - ./sdkmanager --licenses
//     - grant rights for jenkins user to /opt/Android dir
// 5. Configure Android Environment Variables in Jenkins
//     - Manage Jenkins>Configure System. Under Global Settings
//     - ANDROID_HOME=/opt/Android
//     - Save
// 6. For Firebase App Distribution, install firebase CLI (curl -sL https://firebase.tools | bash)  (https://firebase.google.com/docs/cli#install-cli-mac-linux)
// 7. Add PipeLine for this project to Jenkins

 pipeline {
   agent any
   environment {
    APP_ARCHIVE_NAME = 'app'
    APP_MODULE_NAME = 'NoteADay'
    CHANGELOG_CMD = 'git log --date=format:"%Y-%m-%d" --pretty="format: * %s% b (%an, %cd)" | head -n 10 > commit-changelog.txt'
   //        FIREBASE_GROUPS = 'mobile-dev-team, mobile-qa-team'
   //        FIREBASE_APP_DIST_CMD = "firebase appdistribution:distribute app/build/outputs/apk/\$APP_BUILD_TYPE/app-\$APP_BUILD_TYPE.apk --app \$FIREBASE_ID --release-notes-file commit-changelog.txt --groups \"\$FIREBASE_GROUPS\""
   //        GOOGLE_APPLICATION_CREDENTIALS = "${HOME}/google-service-accounts/${APP_MODULE_NAME}.json"

   }
    tools {
           jdk "Java 17"
       }
   options {
     // Stop the build early in case of compile or test failures
     //skipStagesAfterUnstable()
      disableConcurrentBuilds()
   }
   stages {
     // Put your stages here
     stage('Detect build type') {
       steps {
         script {
            if (env.BRANCH_NAME == 'master' || env.CHANGE_TARGET == 'master') {
             env.BUILD_TYPE = 'release'
           }
         }
       }
     }
     stage('Compile') {
       steps {
         // Compile the app and its dependencies
         sh './gradlew compile${BUILD_TYPE}Sources'
       }
     }

     stage('Build') {
       steps {
         // Compile the app and its dependencies
         sh './gradlew assemble${BUILD_TYPE}'
         sh './gradlew generatePomFileForLibraryPublication'
       }
     }
     stage('Publish') {
       steps {
         // Archive the APKs so that they can be downloaded from Jenkins
         archiveArtifacts "**/${APP_NAME}-${BUILD_TYPE}.apk"
         // Archive the ARR and POM so that they can be downloaded from Jenkins
         // archiveArtifacts "**/${APP_NAME}-${BUILD_TYPE}.aar, **/*pom-   default.xml*"
       }
     }

  stage('Make gradlew executable') {
            steps {
                sh 'chmod +x ./gradlew'
            }
        }
     // Put your stages here
   }
 }