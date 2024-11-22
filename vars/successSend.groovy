def call(){
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