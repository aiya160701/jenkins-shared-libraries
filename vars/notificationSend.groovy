def call(){
    if (currentBuild == SUCCESS){
emailext (
                    subject: "SUCCESSFUL:Job ${env.JOB_NAME}",
                    body: """
                        <html>
                            <body>
                                <p>Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished successfully </p>. 
                                <p>This is the job URL: ${env.JOB_URL}</p>
                            </body>
                        <html>
                    """,
                    to: "aiya160701@gmail.com",
                    mimeType: 'text/html'
                    ) 
    }
    else (currentBuild == FAILURE){
emailext (
                subject: "FAILED:Job ${env.JOB_NAME}",
                body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished with failure. This is the job URL: ${env.JOB_URL}",
                to: "aiya160701@gmail.com")
    }
}