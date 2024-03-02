package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ecs.Cluster;
import software.constructs.Construct;

import java.util.Arrays;

public class CursoAwsCdkApp {

    public static void main(final String[] args) {

        App app = new App();

        // Launch a VPC
        VpcStack vpcStack = new VpcStack(app, "Vpc");

        // Launch a ECS Cluster
        ClusterStack clusterStack = new ClusterStack(app, "Cluster", vpcStack.getVpc());

        // Add the VPC dependency to create the ECS Cluster
        clusterStack.addDependency(vpcStack);

        app.synth();
    }
}

