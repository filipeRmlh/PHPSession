package com.filipe;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.*;

public final class PHPSession {
    public static String get(String sessionid,String phpPath){
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        StringBuffer output = new StringBuffer();
        String php = System.getProperty("user.dir")+Paths.get("/getSession.php");
        Process p;
        try {
            if (isWindows) {
                p = Runtime.getRuntime()
                        .exec(String.format("cmd.exe /c %s %s %s",phpPath,php ," "+sessionid));
            } else {
                p = Runtime.getRuntime()
                        .exec(String.format("sh -c %s %s %s",phpPath, php," "+sessionid));
            }
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    public static String get(String sessionid){
        return get(sessionid,"php");
    }

}
