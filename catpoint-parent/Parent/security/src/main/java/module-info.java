module security {
    requires java.desktop;
    requires java.prefs;
    requires com.google.common;
    requires com.google.gson;
    requires miglayout;
    requires image;

    opens com.udacity.catpoint.data to com.google.gson;


}