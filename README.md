# AWS LAMBDA IMPLEMENTATION WITH JAVA - SAM
This project shows a Java implementation representing an AWS Lambda function. 

> This branch extends the [original project](https://github.com/gabrielcostasilva/aws-lambda-java.git) by using AWS SAM for automating the function deployment.

## Overview
An issue with the original project is the function deployment, which requires accessing the AWS console (or any other tool) to deploying the function. AWS SAM helps with this task.

[_AWS SAM_](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/what-is-sam.html) stands for Serverless Application Model. It simplifies the deployment by using a template ([`template.yaml`](./template.yaml)) that describes the resource you need. It is similar to [AWS CloudFormation](https://aws.amazon.com/cloudformation/), but the template description is way simpler.

In addition, AWS SAM provides a CLI tool to automate the deployment configuration and execution.

## Getting Started with SAM
In a nutshell, all you need is `sam init`, `sam build` and `sam deploy --guided`. But there are several details.

First, you need user credentials and permissions. If you already have AWS CLI installed and configured, you are ready to proceed. Otherwise, [check out this video](https://youtu.be/J5T221esBdw) if you need assistance installing and configuring AWS CLI.

Second, you need to [install](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/install-sam-cli.html) AWS SAM. 

Then, you can [get started](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-getting-started-hello-world.html). But, there is a catch: when you use `sam init` it creates an entire new project for you. 

Here, we are building on top of the original project. Therefore, I had to create a new project and copy the template to my original project. I could also create the template by myself, [using the documentation](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/sam-specification-resources-and-properties.html).

`sam init` creates the initial template. As I copied it from another project, I do not need `sam init`. So, `sam build` builds the project, and `sam deploy --guided` deploy it after getting information from the prompt.

> You can [use parameters](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/using-sam-cli-deploy.html) to deploy the application without all the questions asked by `sam deploy --guided`.

SAM will use AWS CloudFormation under the hood to deploy your resources. As a result, you can easily manage your entire stack. To delete, you just run `sam delete` and provide your stack name.

> SAM handles the packaging for you during the build phase. So, for a Java application, it means it creates a JAR file.
