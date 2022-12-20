// IAppDataAidlInterface.aidl
package com.playground.architecture;
// Declare any non-default types here with import statements
interface IAppDataAidlInterface {
             //Get Data from table AppData from Database DataStore
             String getAllAppData();
             //Insert Data into table AppData from Database DataStore
             void insertAppData( String appData );
             //Delete Data from table AppData from Database DataStore
             void updateAppData( String appData );

             String Add10Points(String packageName);
}