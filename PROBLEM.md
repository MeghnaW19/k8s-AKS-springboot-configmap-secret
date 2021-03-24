## Exercise: Deploy a Spring Boot microservice application that uses ConfigMap and Secret on K8s Cluster in Azure AKS .

* In this exercise, you will deploy a Spring Boot application on AKS cluster that uses ConfigMap and Secret. You will use MySQL for persistence of data.

This exercise contains following folders:  

	- k8s - A folder that contains manifest files
	- SbService - This is a Spring Boot application

This exercise contains following files in k8s folder:

	- configmap.yml - This is to create a ConfigMap.
	- secret.yml - This is to create a K8s Secret.
	- mysql.yml - This is to create a MySQL Deployment. It also configures a PersistentVolume(PV), PersistentVolumeClaim(PVC) and the Deployment, Service of type ClusterIP for MySQL.
	- springboot.yml - This is to create the Deployment, Service of type LoadBalancer for Spring Boot application.


**Note**: You need to go through the comments thoroughly and complete the exercise.

Understand and perform following steps to complete this exercise:

	1. Modify the properties in `application.yml` of `SbService`. Build and push the SbService image to Docker Hub.
	2. Verify that the AKS cluster is created and is ready.
	3. Implement the `configmap.yml` to define a ConfigMap.
	4. Implement the `secret.yml` file to define a Secret.
	5. Implement the `mysql.yml` file following the given comments.
	6. Create the PV, PVC, Deployment and Service for MySQL.
	7. Test in Postman the functionalities to create, read, and update users.


### Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided code unless instructed
- Ensure your code compiles without any errors/warning/deprecations
- Follow best practices while coding
