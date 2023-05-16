module image {
    exports com.udacity.catpoint.image.service;
    requires java.desktop;
    requires slf4j.api;

    requires software.amazon.awssdk.auth;
    requires software.amazon.awssdk.awscore;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.services.rekognition;


}