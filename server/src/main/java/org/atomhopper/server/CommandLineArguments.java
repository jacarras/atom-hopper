package org.atomhopper.server;

import org.kohsuke.args4j.*;

public class CommandLineArguments {
    
    private final String defaultPortInfo = "(Default is port 8080, range is 1024 to 49150)";
    protected final String ACTION_START = "start";
    protected final String ACTION_STOP = "stop";

    @Option(name = "-p", aliases = {"--port"},
            usage = "Atom Hopper port number " + defaultPortInfo)
    public Integer port = 8080;
    
    @Option(name = "-s", aliases = {"--shutdown-port"},
            usage = "The port used to communicate a shutdown to Atom Hopper " + defaultPortInfo)
    public Integer stopport = 8818;
    
    //Note: I recommend keeping this an argument to stay inline with what people expect from a daemon script
    @Argument(usage = "Action to take - start | stop", required = true)
    public String action = ACTION_START;
}
