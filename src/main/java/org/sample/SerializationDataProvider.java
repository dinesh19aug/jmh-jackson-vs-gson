package org.sample;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public  class SerializationDataProvider
{
    public static String jsonString1Kb;
    public static String jsonString10Kb;
    public static String jsonString100Kb;
    public static String jsonString1mb;

    public static User obj1Kb;
    public static User obj10Kb;
    public static User obj100Kb;
    public static User obj1000Kb;
    @Setup(Level.Invocation)
    public static void setup() {
        jsonString1Kb=JsonReadFile.readFileToString("C:\\Users\\dines\\Desktop\\payload\\freeformatter-out-1kb.json");
        jsonString10Kb = JsonReadFile.readFileToString("C:\\Users\\dines\\Desktop\\payload\\freeformatter-out-10kb.json");
        jsonString100Kb = JsonReadFile.readFileToString("C:\\Users\\dines\\Desktop\\payload\\freeformatter-out-100kb.json");
        jsonString1mb = JsonReadFile.readFileToString("C:\\Users\\dines\\Desktop\\payload\\freeformatter-out-1mb.json");

        obj1Kb = JsonReadFile.createUserObject("2");
        obj10Kb = JsonReadFile.createUserObject("56");
        obj100Kb = JsonReadFile.createUserObject("603");
        obj1000Kb = JsonReadFile.createUserObject("6053");

    }
}
