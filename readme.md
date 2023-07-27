## About
<ul>
  <li> This repo will conatain all the task I did on weekly basis as my task for now isn't directly on parent code base.</li> 
  <li>Therefore, wont be having any major PR for the same . </li>
</ul>

## Milestones decided
- [x] Selecting a remote File and doing all the task for prog=ject over it 
- [x] Mapping of Json file made
- [] kafka ingestion of ES
- [] Mapping file for telementry
- [] Flink job conversion
- [] Automation and Documentation 

## Review schedule
- [x] First review on sharing of mapping
- [] Second review complete the logic to ingest the data to es from kafka
- [] Third review create the es mapping file for the sunbird telemetry and ingestion of the sunbird telemetry from kafka to es
- [] Fourth review -  Converting the algorithm to flink job.
- [] Fifth review - Automation
- [] Six review - Documentation

## Phases 

Phase - 1 
-  RUN The Elastic search in local
- Creation ES Mapping file
- Submit the es mapping file
- Create a sample data wchich is associated to es mapping
- Submit the sample data

Phase -2 
- Run the kafka in locally
- Create the topics
- Push the events to kafka topic
- Write a script or use any lib to index the data from the kafka to es

Phase - 3 
- Use the sunbird telemetry data to index the data from kafka to es
- Create the es mapping file for the sunbird telemetry
- Sample data from kafka to es

Phase - 4
- Convert the script to flink job
- Verifiy the functionality (kafka to es index) with sunbird telemetry

Phase - 5
- Automate the es provision and run the es in the kubernetes
- Run the flink in the kubernets
- Create a helm charts for both to run them in the kubernetes

Phase - 6
- Raise the final pull request to opensource with the documentation and testcases
